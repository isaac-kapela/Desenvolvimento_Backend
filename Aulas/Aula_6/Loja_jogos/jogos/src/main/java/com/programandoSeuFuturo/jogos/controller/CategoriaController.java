package com.programandoSeuFuturo.jogos.controller;


import com.programandoSeuFuturo.jogos.model.Categoria;
import com.programandoSeuFuturo.jogos.model.Jogo;
import com.programandoSeuFuturo.jogos.repository.CategoriaRepository;
import com.programandoSeuFuturo.jogos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.getAll());
    }


   @PostMapping
    public ResponseEntity<List<Categoria>> save(@RequestBody Categoria categoria){
       return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonList(categoriaService.save(categoria)));

    }
}
