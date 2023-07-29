package com.example.ecommerce.controller;


import com.example.ecommerce.model.Comestico;
import com.example.ecommerce.service.ComesticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/comesticos")
@CrossOrigin("http://localhost:4200")
public class ComesticoController {


    @Autowired
    private ComesticoService comesticoService;

    @GetMapping

    public ResponseEntity<List<Comestico>> getAll(){
        List<Comestico> comesticoList = comesticoService.getAll();

        return ResponseEntity.status(HttpStatus.OK).body(comesticoList);


    }

    @GetMapping("/{id}")
    public Comestico getByyId(@PathVariable int id){
        return comesticoService.getById(id);
    }

    @PostMapping
    public String save(@RequestBody Comestico comestico){
        return comesticoService.save(comestico);
    }

    @DeleteMapping("/{id}")

    public String delete(@PathVariable int id){
        return comesticoService.delete(id);
    }





}
