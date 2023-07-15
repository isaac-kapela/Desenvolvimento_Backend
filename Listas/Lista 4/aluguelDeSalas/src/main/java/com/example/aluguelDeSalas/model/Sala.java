package com.example.aluguelDeSalas.model;

public class Sala {

    private  int id;
    private boolean estaAlugado;
    private String nomeDoLocatario;

    public Sala() {
    }

    public Sala(int id, boolean estaAlugado, String nomeDoLocatario) {
        this.id = id;
        this.estaAlugado = estaAlugado;
        this.nomeDoLocatario = nomeDoLocatario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstaAlugado() {
        return estaAlugado;
    }

    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

    public String getNomeDoLocatario() {
        return nomeDoLocatario;
    }

    public void setNomeDoLocatario(String nomeDoLocatario) {
        this.nomeDoLocatario = nomeDoLocatario;
    }
}
