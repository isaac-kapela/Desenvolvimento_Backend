package com.programandoSeuFuturo.jogos.controller;

import com.programandoSeuFuturo.jogos.model.Conta;
import com.programandoSeuFuturo.jogos.model.Jogo;
import com.programandoSeuFuturo.jogos.service.ContaService;
import com.programandoSeuFuturo.jogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta conta){
        Conta contaRetornado = contaService.save(conta);
        if (conta == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contaRetornado);
    }
}
