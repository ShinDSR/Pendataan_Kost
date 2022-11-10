package com.kost.data.kost.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kost.data.kost.models.entities.type;
import com.kost.data.kost.services.TypeService;

@RestController
@RequestMapping("/type")
public class typeController {
    
    @Autowired
    private TypeService typeService;

    @PostMapping
    public type create(@RequestBody type type1){
        return typeService.save(type1);
    }

    @GetMapping
    public Iterable<type> findAll(){
        return typeService.findAll();
    }
}
