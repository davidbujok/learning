package com.biscuits.Tea_and_Biscuits.models;

import javax.persistence.*;

@Entity
@Table(name = "teas")
public class Tea {

    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Tea(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Tea(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brand;
    }

    public void setBrandName(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
