package com.codeclan.example.pirateservice.models;

import javax.persistence.*;

// POJO - plain old java object
// You need to have GETTER and SETTER for all attributes in SPRING!!
@Entity // this is say that what follows will be the table/model in database
@Table(name="pirates")
public class Pirate {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String secondName;
    @Column(name = "age")
    private int age;
    @Id // this is to tell that what is bellow will be a key in db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //has to be called id < this is for db

    public Pirate(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }


    public Pirate(){} // You need to have empty constructor in model in SPRING!!

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
