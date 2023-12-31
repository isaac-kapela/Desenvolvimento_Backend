package com.programandoSeuFuturo.jogos.service;

import com.programandoSeuFuturo.jogos.model.Jogo;
import com.programandoSeuFuturo.jogos.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getAll(){
        return jogoRepository.findAll();
    }
    public Jogo save(Jogo jogo){
        return jogoRepository.save(jogo);
    }

}
