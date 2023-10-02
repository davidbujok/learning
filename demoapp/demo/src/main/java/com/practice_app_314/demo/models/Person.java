package com.practice_app_314.demo.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    private String name;
    private String surname;
    @Column(name = "day_of_birth")
    private Date dayOfBirth;
    private String address;
    @Column(name = "house_number")
    private String houseNo;
    @Column(name = "post_code")
    private String postCode;
    private int age;
    @OneToMany(mappedBy = "person")
    private List<Clothes> clothes;

    @Id
    @GeneratedValue
    private Long id;


    public Person(String name, String surname, Date dayOfBirth, String address, String houseNo, String postCode, int age) {

        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.houseNo = houseNo;
        this.postCode = postCode;
        this.age = age;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
