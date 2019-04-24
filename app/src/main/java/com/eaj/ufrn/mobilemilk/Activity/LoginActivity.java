package com.eaj.ufrn.mobilemilk.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.eaj.ufrn.mobilemilk.Modelo.Credencial;
import com.eaj.ufrn.mobilemilk.Modelo.Token;
import com.eaj.ufrn.mobilemilk.R;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    private Toolbar myToolbar;
    private TextView usuario, senha;

    private Credencial credencial;

    private Integer tokenAcesso;

    //private SharedPreferences prefs = getSharedPreferences("PREFS_NAME",MODE_PRIVATE);    // Usado para armazenar o token de acesso...
   // private SharedPreferences.Editor editor = this.prefs.edit();                                // usado para editar o prefs da aplicação...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle(R.string.Login); // Adiciona um Title ao ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // habilita a seta voltar

        this.senha = findViewById(R.id.senha);
        this.usuario = findViewById(R.id.usuario);

    }

    public void autenticar(View v){
        if(!this.senha.getText().toString().equals("") && !this.usuario.getText().toString().equals("")){
            this.credencial = new Credencial(this.senha.getText().toString(), this.usuario.getText().toString());

            Log.i("credencial", "senha: " + credencial.getSenha() + " username: " + credencial.getUsername());

            HashMap<String, Object> parans = new HashMap<>();
            parans.put("username", usuario.getText().toString());
            parans.put("senha", senha.getText().toString());

            Log.i("teste", "usuario: "+ parans);

            Call<Token> call = Credencial.autenticacaoCliente(parans);
            call.enqueue(new Callback<Token>() {
                @Override
                public void onResponse(Call<Token> call, Response<Token> response) {
                    if(response.isSuccessful()){
                        Log.i("headers", ""+ response.headers().get("Authorization"));
                        Log.i("body", ""+ response.body());
                        Log.i("toString", ""+ response.toString());
                        Log.i("message", ""+ response.message());
                        Log.i("token", ""+ response.body());
                    }
                    else{
                        Log.i("xx", ""+ response.toString());
                        Log.i("xx", ""+ response.errorBody());
                        Log.i("xx", ""+ response.message());
                        Snackbar snack = Snackbar.make(findViewById(R.id.layoutParent), "Usuário e senha incorretos", Snackbar.LENGTH_SHORT);
                        snack.show();
                    }
                }

                @Override
                public void onFailure(Call<Token> call, Throwable t) {
                    Log.i("yy", ""+ t.getStackTrace());
                    Log.i("yy", ""+ t.getMessage());
                    Log.i("yy", ""+ t.getCause());
                    Log.i("yy", ""+ t.toString());
                }
            });
        }
        else{
            Snackbar snack = Snackbar.make(findViewById(R.id.layoutParent), "Preencha os campos corretamente", Snackbar.LENGTH_SHORT);
            snack.show();
        }
    }

}
