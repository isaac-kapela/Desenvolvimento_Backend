package com.example.Ativi.controller.jogo;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@GetMapping
@RequestMapping("/ativi")
public class controller {

    @NotNull
    int id;
    @NonNull
     String nome;
     @NonNull
     String descricao;
     @NonNull
     int preco;
}

 // public  Controller () `{

     //   }