package com.eaj.ufrn.mobilemilk.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.eaj.ufrn.mobilemilk.R;

public class CadastrarFazendaActivity extends AppCompatActivity {

    private TextView empresaFazenda;
    private TextView localizacaoFazenda;
    private TextView cnpjFazenda;
    private TextView enderecoFazenda;
    private TextView numeroFazenda;
    private TextView bairroFazenda;
    private TextView cidadeFazenda;
    private TextView estadoFazenda;

    private Button adicionar;
    private Button confirmar;
    private Button cancelar;


    private String empresa;
    private String localizacao;
    private String cnpj;
    private String cep;
    private String endereco;

    private Bundle bundle;

    @Override
    protected void onCreate(Bundle saveInstanteState){
        super.onCreate(saveInstanteState);
        setContentView(R.layout.activity_cadastrar_fazenda);

        getSupportActionBar().setTitle(R.string.CadastrarFazenda); // Seta um titulo ao ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Habilita a seta voltar

        this.empresaFazenda = findViewById(R.id.empresaFazenda);
        this.localizacaoFazenda = findViewById(R.id.localizacaoFazenda);
        this.cnpjFazenda = findViewById(R.id.cnpjFazenda);
        //this.cepFazenda = findViewById(R.id.cepFazenda);
        this.enderecoFazenda = findViewById(R.id.enderecoFazenda);
        this.numeroFazenda = findViewById(R.id.numeroFazenda);
        this.bairroFazenda = findViewById(R.id.bairroFazenda);
        this.cidadeFazenda = findViewById(R.id.cidadeFazenda);
        this.cidadeFazenda = findViewById(R.id.estadoFazenda);
        this.adicionar = findViewById(R.id.bAdicionar);
        this.confirmar = findViewById(R.id.bCadastrar);
        this.cancelar = findViewById(R.id.bCancelar);

    }
}
