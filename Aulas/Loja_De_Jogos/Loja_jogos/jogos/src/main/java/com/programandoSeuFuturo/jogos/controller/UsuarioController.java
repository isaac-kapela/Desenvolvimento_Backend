package com.programandoSeuFuturo.jogos.controller;

import com.programandoSeuFuturo.jogos.model.Jogo;
import com.programandoSeuFuturo.jogos.model.Usuario;
import com.programandoSeuFuturo.jogos.service.JogoService;
import com.programandoSeuFuturo.jogos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        Usuario usuarioRetornado = usuarioService.save(usuario);
        if (usuarioRetornado == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRetornado);
    }
}
