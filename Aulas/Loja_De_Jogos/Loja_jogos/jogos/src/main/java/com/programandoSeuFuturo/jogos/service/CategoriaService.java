package com.programandoSeuFuturo.jogos.service;

import com.programandoSeuFuturo.jogos.model.Categoria;
import com.programandoSeuFuturo.jogos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class CategoriaService {
        @Autowired
         private CategoriaRepository categoriaRepository;

        public List<Categoria> getAll(){
            return categoriaRepository.findAll();
        }

        public Categoria save(Categoria categoria){
            return categoriaRepository.save(categoria);
        }




    }
