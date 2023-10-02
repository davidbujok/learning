package com.practice_app_314.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Cloths")
public class Clothes {
    private String name;
    private String category;
    private double price;
    private String size;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Id
    @GeneratedValue
    private Long id;

    public Clothes(String name, String category, double price, String size) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.size = size;
    }

    public Clothes(){}
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
