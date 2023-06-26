package com.example.apiviacep.controller;


import com.example.apiviacep.model.Endreco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @GetMapping("{/cep}")
    public Endreco obterEndereco(@PathVariable String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        RestTemplate restTemplate = new RestTemplate();
        Endreco endreco = restTemplate.getForObject(url,Endreco.class);
        return endreco;
    }



}
