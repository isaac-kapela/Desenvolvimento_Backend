package controller;


import model.Produtos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Produtos")
public class ProdutosController {

    private  List<Produtos>produtos = new ArrayList<>();

    public  ProdutosController(){
        produtos.add(new Produtos(11,"Sofa",2.000));
        produtos.add(new Produtos(12,"Mesa",6.000));
        produtos.add(new Produtos(13,"Geladeira",2.500));
        produtos.add(new Produtos(14,"Tv",3.000));
    }


    @GetMapping
    public List<Produtos>getAll(){
        return produtos;
    }

    @GetMapping("/{codigoDeBarras}")
    public Produtos getBycodigoDeBarras(@PathVariable int codigoDeBarras){
        for(Produtos produtos : produtos){
            if(produtos.getCodigoDeBarras() == codigoDeBarras){
                return produtos;
            }
        }
        return null;
    }
    @PostMapping
    public String Save(@RequestBody Produtos produtos){
        this.produtos.add(produtos);
        return "Produto"+ produtos.getNome() + "foi adicionado ao estoque!”";
        
    }
    

}
