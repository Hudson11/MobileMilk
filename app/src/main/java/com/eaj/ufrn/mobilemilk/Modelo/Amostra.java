package com.eaj.ufrn.mobilemilk.Modelo;

import com.eaj.ufrn.mobilemilk.Enum.AnalisesSolicitadas;
import com.eaj.ufrn.mobilemilk.Enum.Leite;
import com.eaj.ufrn.mobilemilk.Enum.OrigemLeite;
import com.eaj.ufrn.mobilemilk.Enum.Produtos;

import java.util.Date;

public class Amostra {

    private Date dataColeta;
    private Integer numAmostras;
    private String qrCode;
    private String observacao;
    private Analise analise;

    public Amostra(Date dataColeta, Integer numAmostras, String qrCode, String observacao, Analise analise) {
        this.dataColeta = dataColeta;
        this.numAmostras = numAmostras;
        this.qrCode = qrCode;
        this.observacao = observacao;
        this.analise = analise;
    }

    public Amostra(){

    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public Integer getNumAmostras() {
        return numAmostras;
    }

    public void setNumAmostras(Integer numAmostras) {
        this.numAmostras = numAmostras;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Analise getAnalise() {
        return analise;
    }

    public void setAnalise(Analise analise) {
        this.analise = analise;
    }
}