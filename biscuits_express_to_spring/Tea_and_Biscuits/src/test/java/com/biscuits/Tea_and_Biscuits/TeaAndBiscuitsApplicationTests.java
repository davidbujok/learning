package com.biscuits.Tea_and_Biscuits;

import com.biscuits.Tea_and_Biscuits.models.Biscuit;
import com.biscuits.Tea_and_Biscuits.models.Tea;
import com.biscuits.Tea_and_Biscuits.repositories.BiscuitRepository;
import com.biscuits.Tea_and_Biscuits.repositories.TeasRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeaAndBiscuitsApplicationTests {

	@Autowired
	TeasRepository teasRepository;
	@Autowired
	BiscuitRepository biscuitRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createBiscuit(){
		Biscuit biscuit = new Biscuit("Crunch", "Nestle");
		biscuitRepository.save(biscuit);
	}
	@Test
	public void createTea() {
		Tea tea = new Tea("Earl Grey", "Essential");
		teasRepository.save(tea);
	}

}
