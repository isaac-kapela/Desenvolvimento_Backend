package com.example.apiviacep.model;

public class Endreco {
    private int cep;
    private String lorgadouro;
    private  String complemento;
    private String bairro;
    private String localidade;
    private  String uf;
    private  int ibge;
    private int gia;
    private  int ddd;
    private int siafi;

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLorgadouro() {
        return lorgadouro;
    }

    public void setLorgadouro(String lorgadouro) {
        this.lorgadouro = lorgadouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getSiafi() {
        return siafi;
    }

    public void setSiafi(int siafi) {
        this.siafi = siafi;
    }
}
