package controller;

import model.JogoDigitais;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    public ArrayList<JogoDigitais> getAll() {
        return jogoDigitais;
    }

    @GetMapping("/{id}")
    public JogoDigitais getById(@PathVariable int id) {
        for (JogoDigitais jogoDigitais : jogoDigitais) {
            if (jogoDigitais.getId() == id) {
                return jogoDigitais;

            }
        }
        return null;
    }

    @GetMapping
    public JogoDigitais getMenorPreco() {
        int menorPreco = 0;
        int index = 0;
        for (int i = 0; i < jogoDigitais.size(); i++) {
            if (jogoDigitais.get(i).getPreco() < menorPreco) {
                menorPreco = (int) jogoDigitais.get(i).getPreco();
                index = i;
            }
        }
        return jogoDigitais.get(index);
    }

    @PostMapping
    public String save(@RequestBody JogoDigitais jogoDigitais){
        this.jogoDigitais.add(jogoDigitais);
        return "Jogo"+ jogoDigitais.getNome()+ "foi adicionado ao catalogo!";
    }
}