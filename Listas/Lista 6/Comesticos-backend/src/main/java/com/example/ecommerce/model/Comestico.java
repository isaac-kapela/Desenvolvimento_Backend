package com.example.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comestico {
    private int id;
    private String nome;

    private double preco;

    private String descricao;


    private String img;
    @JsonProperty("esta_favoritado")
    public boolean estaFavoritado;


    public Comestico() {
    }

    public Comestico(int id, String nome, double preco, String descricao, boolean estaFavoritado,String img){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estaFavoritado = estaFavoritado; this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstaFavoritado() {
        return estaFavoritado;
    }

    public void setEstaFavoritado(boolean estaFavoritado) {
        this.estaFavoritado = estaFavoritado;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
