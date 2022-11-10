package com.kost.data.kost.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kost.data.kost.models.entities.type;
import com.kost.data.kost.models.repos.typeRepo;

@Service
@Transactional
public class TypeService {

    @Autowired
    private typeRepo type_repo;

    public type save(type type1){
        return type_repo.save(type1);
    }
    
    public type findOne(long id_type){
        return type_repo.findById(id_type).get();
    }

    public Iterable<type> findAll(){
        return type_repo.findAll();
    }

    public void removeOne(long id_type){
        type_repo.deleteById(id_type);
    }

    public List<type> findByName(String name){
        return type_repo.findByNameContains(name);
    }
}
