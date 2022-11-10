package com.kost.data.kost.models.entities;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "type")
public class type implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id_type;

    public  char nama_type;

    public char luas;

    public type() {
        
    }

    public type(Long id, char nama_type, char luas) {
        this.id = id;
        this.nama_type = nama_type;
        this.luas = luas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getNama_type() {
        return nama_type;
    }

    public void setNama_type(char nama_type) {
        this.nama_type = nama_type;
    }

    public char getLuas() {
        return luas;
    }

    public void setLuas(char luas) {
        this.luas = luas;
    }

    
    
}
