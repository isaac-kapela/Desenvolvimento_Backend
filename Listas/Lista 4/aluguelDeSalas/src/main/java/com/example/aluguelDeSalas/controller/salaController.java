package com.example.aluguelDeSalas.controller;


import com.example.aluguelDeSalas.model.Sala;
import com.example.aluguelDeSalas.service.SalaService;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class salaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }
}
