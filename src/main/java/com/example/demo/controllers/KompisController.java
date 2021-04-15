package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by: Ulf Nyberg
 * Date: 2021-04-15
 * Time: 10:54
 * Project: demo
 * Copyright: MIT
 */
@RestController
@RequestMapping (path = "/kompis")
public class KompisController {

    @Autowired
    private KompisRepository kompisRepo;

    @GetMapping (path = "/add")
    public String addKompis (@RequestParam String name, @RequestParam String email, @RequestParam String phoneNumber){
        Kompis k = new Kompis();
        k.setName(name);
        k.setEmail(email);
        k.setPhoneNumber(phoneNumber);
        kompisRepo.save(k);
        return "Kompis was saved!";
    }


    @GetMapping (path = "/all")
    public Iterable <Kompis> allKompisar(){
    return kompisRepo.findAll();
    }




}
