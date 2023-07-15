package com.example.ecommerce.controller;


import com.example.ecommerce.model.Comestico;
import com.example.ecommerce.service.ComesticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/comesticos")
public class ComesticoController {


    @Autowired
    private ComesticoService comesticoService;

    @GetMapping

    public List<Comestico> getAll(){
        return comesticoService.getAll();

    }

    @GetMapping("/{id}")
    public Comestico getByyId(@PathVariable int id){
        return comesticoService.getById(id);
    }

    @PostMapping
    public boolean save(@RequestBody Comestico comestico){
        return comesticoService.save(comestico);
    }

    @DeleteMapping("/{id}")

    public String delete(@PathVariable int id){
        return comesticoService.delete(id);
    }





}
