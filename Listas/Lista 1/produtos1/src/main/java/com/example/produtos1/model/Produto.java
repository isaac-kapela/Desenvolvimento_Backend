package com.example.produtos1.model;

public class Produto {
    private int codigoDeBarra;
    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(int codigoDeBarra, String nome, double preco) {
        this.codigoDeBarra = codigoDeBarra;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
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
}
