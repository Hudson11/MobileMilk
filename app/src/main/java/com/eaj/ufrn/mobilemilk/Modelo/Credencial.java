package com.eaj.ufrn.mobilemilk.Modelo;

import com.eaj.ufrn.mobilemilk.Retrofit.RetrofitConfig;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Response;

public class Credencial {

    private String senha;
    private String username;

    public Credencial(String senha, String username) {
        this.senha = senha;
        this.username = username;
    }

    public Credencial(){

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "senha='" + senha + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

}
