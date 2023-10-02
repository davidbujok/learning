package com.codeclan.example.pirateservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "ship_id", nullable = false)
    @JsonIgnoreProperties({"pirates"})
    private Ship ship;
    @Id // this is to tell that what is bellow will be a key in db
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //has to be called id < this is for db

    @Column(name = "pirates")
    @ManyToMany
    @JsonIgnoreProperties({"pirates"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "pirate_raids",
            joinColumns = {
                    @JoinColumn(
                            name = "pirate_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "raid_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )
    private List<Raid> raids;

    public Pirate(String firstName, String secondName, int age, Ship ship) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.ship = ship;
        this.raids = new ArrayList<>();
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

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void addRaid(Raid raid){
        raids.add(raid);
    }


}
