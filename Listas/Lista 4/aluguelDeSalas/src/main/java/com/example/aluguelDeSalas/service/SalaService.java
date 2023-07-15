package com.example.aluguelDeSalas.service;


import com.example.aluguelDeSalas.model.Sala;
import com.example.aluguelDeSalas.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class SalaService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.findAll();
    }

    public String atualizar(Sala sala){
        return bancoDeDados.atualizar(sala);
    }

    public String SalaDesalugada (Sala sala){
        return bancoDeDados.SalaDesalugada(sala);
    }


}
