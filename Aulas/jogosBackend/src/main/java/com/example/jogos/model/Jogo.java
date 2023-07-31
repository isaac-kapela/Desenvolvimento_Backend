package com.example.jogos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogo {
    private  int id;
    private String nome;
    private String descricao;
    private   String img;
    private double preco;

    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;

    public Jogo(){
    }

    public Jogo(int id,String nome, String descricao,String img,double preco,boolean estaFavoritado){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.img = img;
        this.preco = preco;
        this.estaFavoritado = estaFavoritado;

    }
     public int getId(){
        return id;
     }

     public void setId(int id){
        this.id = id;
     }

     public String getNome(){
        return nome;
     }

     public void setNome(){
        this.id = id;
     }
     public String getDescricao(){
        return descricao;
     }
     public void setDescricao(){
        this.estaFavoritado = estaFavoritado;
     }

     public String getImg(){
        return img;
     }
     public void setImg(){
        this.img = img;
     }
     public double getPreco(){
        return preco;
     }

     public void setPreco(){
        this.preco = preco;
     }

     public boolean isEstaFavoritado(){
        return estaFavoritado;
     }
     public void setEstaFavoritado(){
        this.estaFavoritado = estaFavoritado;
     }



}
