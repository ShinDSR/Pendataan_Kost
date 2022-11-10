package com.kost.data.kost.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kost.data.kost.models.entities.type;

public interface typeRepo extends CrudRepository<type, Long> {

    List<type> findByNameContains(String name);
}