package com.example.ecommerce.repository;

import com.example.ecommerce.model.Comestico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDeDados {

    List<Comestico> comesticos = new ArrayList<>();

    public BancoDeDados() {
        comesticos.add(new Comestico(1, "One Million", 150));
        comesticos.add(new Comestico(2, "One ", 100));
        comesticos.add(new Comestico(3, "212 vip", 200));
        comesticos.add(new Comestico(4, "Perfume do Batman", 300));
        comesticos.add(new Comestico(5, "Perfume do Homen Aranha", 150));
        comesticos.add(new Comestico(6, "perfume dos vingadores", 220));
        comesticos.add(new Comestico(7, "perfume do Banguela", 150));
        comesticos.add(new Comestico(8, "Perfume da mulher Maravilha", 270));

    }

    public List<Comestico> findAll() {
        return comesticos;
    }

    public String save (Comestico comestico){
        for (Comestico comestico1 : comesticos){
            if(comestico1.getId()== comestico.getId()){
                return "impossível cadastrar! cosmético já consta no banco";
            }
        }
        comesticos.add(comestico);
        return "O comestico" + comestico.getNome() + "foi cadastrado com sucesso!";
    }



    public String delete(int id) {
        for (Comestico comestico : comesticos) {
            if (comestico.getId() == id) {
                String mensagem = "O comestico " + comestico.getNome() + "foi deletado com sucesso";
                comesticos.remove(comestico);
                return mensagem;
            }
        }
        return "Cosmetico inexistente";


    }
}