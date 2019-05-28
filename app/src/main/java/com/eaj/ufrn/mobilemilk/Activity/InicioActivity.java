package com.eaj.ufrn.mobilemilk.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.eaj.ufrn.mobilemilk.R;

public class InicioActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_inicio);

        getSupportActionBar().hide(); // Remove o ActionBar do AppTheme default do Projeto.
    }

    public void loginAuth(View v){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }

    public void cadastrar(View v){
        Intent i = new Intent(this, CadastrarClienteActivity.class);
        startActivity(i);
    }

}
