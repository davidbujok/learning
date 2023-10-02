package com.practice_app_314.demo;

import com.practice_app_314.demo.models.Clothes;
import com.practice_app_314.demo.models.Person;
import com.practice_app_314.demo.repositories.ClothesRepository;
import com.practice_app_314.demo.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	PersonRepository personRepository;
	@Autowired
	ClothesRepository clothesRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPerson(){
		Date birth = new Date();
		Person john = new Person("David", "Bujok", birth, "no help", "4", "12", 34);
		personRepository.save(john);
	}
	@Test
	public void createClothes(){
		Clothes dress = new Clothes("Flower dress", "Dress", 34.5, "S");
		clothesRepository.save(dress);
	}
	@Test
	public void personCanOwnDress(){
		Date birth = new Date();
		Person randy = new Person("Randy", "Olenston", birth, "yes help", "11", "12 by w", 54);
		personRepository.save(randy);
		Clothes jeans = new Clothes("Diesel", "jeans", 32.32, "32");
		jeans.setPerson(randy);
		clothesRepository.save(jeans);
	}



}
