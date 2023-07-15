package com.example.aluguelDeSalas.repository;

import com.example.aluguelDeSalas.model.Sala;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Sala> salas = new ArrayList<>();


    public BancoDeDados() {
        salas.add(new Sala(1, true, "Pedro "));
        salas.add(new Sala(2, false, "Maria "));
        salas.add(new Sala(3, false, "Marcos"));
        salas.add(new Sala(4, true, "Ana"));
        salas.add(new Sala(5, false, "Matheus"));
        salas.add(new Sala(6, true, "silva"));
        salas.add(new Sala(7, true, "Miranda"));
        salas.add(new Sala(8, false, "Bruno"));
    }

    public List<Sala> findAll() {
        return salas;
    }


    public String atualizar(Sala sala) {
        for (Sala sala1: salas){
            if (sala1.getId()==sala1.getId()){
                if(!sala1.isEstaAlugado()){
                    sala1.setEstaAlugado(true);
                    sala1.setNomeDoLocatario(sala.getNomeDoLocatario());
                    return "Essa sala ja esta alugada";
                }

            }
        }    return null;
    }
    public String SalaDesalugada(Sala sala){
        for (Sala sala1: salas){
            if (sala.getId()== sala1.getId()){
                if (sala1.isEstaAlugado()){
                    sala1.setEstaAlugado(false);
                    sala1.setNomeDoLocatario("");
                    return " A sal foi desalugada com sucesso";
                } else if (!sala1.isEstaAlugado()) {
                    return "Esta sala ja esta desalugada";

                }
            }
        } return null;
    }

}