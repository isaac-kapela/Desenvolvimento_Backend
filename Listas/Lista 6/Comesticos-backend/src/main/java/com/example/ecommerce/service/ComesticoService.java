package com.example.ecommerce.service;

import com.example.ecommerce.model.Comestico;
import com.example.ecommerce.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComesticoService {

    @Autowired
    private BancoDeDados bancoDeDados;


    public List<Comestico> getAll(){
        return bancoDeDados.findAll();
    }

    public Comestico getById(int id){
        List<Comestico> comesticos = bancoDeDados.findAll();
        for (Comestico comestico: comesticos){
            if(comestico.getId()== id){
                return comestico;
            }
        }
        return null;
    }

    public String save(Comestico comestico){
        return bancoDeDados.save(comestico);
    }

    public String delete(int id){
         return bancoDeDados.delete(id);
    }

}



