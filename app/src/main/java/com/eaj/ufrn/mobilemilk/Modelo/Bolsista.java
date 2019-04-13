package com.eaj.ufrn.mobilemilk.Modelo;

import com.eaj.ufrn.mobilemilk.Enum.TipoPerfilUsuario;

public class Bolsista extends Usuario {
    public Bolsista() {
    }

    public Bolsista(String nome, String email, String cpf, TipoPerfilUsuario codigoTipoPerfilUsuario) {
        super(nome, email, cpf, codigoTipoPerfilUsuario);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public TipoPerfilUsuario getCodigoTipoPerfilUsuario() {
        return super.getCodigoTipoPerfilUsuario();
    }

    @Override
    public void setCodigoTipoPerfilUsuario(TipoPerfilUsuario codigoTipoPerfilUsuario) {
        super.setCodigoTipoPerfilUsuario(codigoTipoPerfilUsuario);
    }
}
