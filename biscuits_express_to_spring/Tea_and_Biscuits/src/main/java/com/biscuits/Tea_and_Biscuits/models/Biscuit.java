package com.biscuits.Tea_and_Biscuits.models;

import javax.persistence.*;

@Entity
@Table(name = "biscuit")
public class Biscuit {

    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Biscuit(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Biscuit(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
