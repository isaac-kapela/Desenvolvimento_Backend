package com.example.produtos1.controller;

import com.example.produtos1.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(1232,"sofa",2.000));
        produtos.add(new Produto(3422,"Mesa",500));
        produtos.add(new Produto(2454,"Geladeira",2.500));
        produtos.add(new Produto(35214,"TV",3.000));
        produtos.add(new Produto(43995,"Micro-ondas",700));
    }
    @GetMapping
    public ArrayList<Produto>getAll(){
        return produtos;
    }

    @GetMapping("{codigoDeBarra}")
    public Produto getBycodigoDeBarra(@PathVariable int codigoDeBarra){
        for(Produto produto : produtos){
            if (produto.getCodigoDeBarra() == codigoDeBarra){
                return produto;
            }
        }
        return null;
    }
    @PostMapping
    public String save(@RequestBody Produto produto){
        for(Produto produto1: produtos){
            if (produto1.getCodigoDeBarra() == produto1.getCodigoDeBarra()){
                return "Produto ja existente";
            }
            else {
                this.produtos.add(produto);
                return "O produto" + produto1.getNome()+ "foi cadastrado com sucesso";
            }
        }
        return null;
    }
}
