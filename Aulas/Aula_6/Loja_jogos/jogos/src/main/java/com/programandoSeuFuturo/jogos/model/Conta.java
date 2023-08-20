package com.programandoSeuFuturo.jogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Conta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;


    @NotNull
    private String email;

    @OneToMany(mappedBy = "conta",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("conta")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "conta",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("conta")
    private  List<Jogo> jogos;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
}
