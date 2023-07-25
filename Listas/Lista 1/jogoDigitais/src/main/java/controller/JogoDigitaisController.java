package controller;

import model.JogoDigitais;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/JogoDigitais")
public class JogoDigitaisController {

    private ArrayList<JogoDigitais> jogoDigitais = new ArrayList<>();

    public JogoDigitaisController() {
        jogoDigitais.add(new JogoDigitais(1, "sonic", 100));
        jogoDigitais.add(new JogoDigitais(2, "sonic 2", 150));
        jogoDigitais.add(new JogoDigitais(3, "sonic 3", 200));
        jogoDigitais.add(new JogoDigitais(4, "sonic final", 250));
    }
    @GetMapping
    public List<JogoDigitais> getAll(){
        return jogoDigitais;
    }


    @GetMapping("/{id}")
    public JogoDigitais BuscarID(@PathVariable int id){
        for(JogoDigitais jogoDigitais1: jogoDigitais){
            if(jogoDigitais1.getId()== id){
                return jogoDigitais1;

            }

        }
        return null;
    }

    @GetMapping("/jogoDigitais")
    public JogoDigitais buscarNome(@RequestHeader String nome){
        for (JogoDigitais jogoDigitais1: jogoDigitais){
            if (jogoDigitais1.getNome() == (nome)){
                return jogoDigitais1;

            }
        }
        return null;
    }

    @GetMapping("/menor-preco")
    public JogoDigitais buscarMenorPreco(){
        double menorPreco = 0;
        int index = 0;
        for(int i = 0; i < jogoDigitais.size(); i++ ){
            if (jogoDigitais.get(i).getPreco() < menorPreco){
                menorPreco = jogoDigitais.get(i).getPreco();
                index =i;

            }
        }
        return null;
    }

    @PostMapping
    public String cadastroJogo(@RequestBody JogoDigitais jogoDigitais){
        for(JogoDigitais jogoDigitais1: jogoDigitais){
            if (jogoDigitais1.getId() == jogoDigitais.getId()){
                return "O jogo ja existe";

            }
        }
        jogoDigitais.add(jogoDigitais);
        return "O jogo" + jogoDigitais.getNome() + " foi adicionado com sucesso!";
    }
}