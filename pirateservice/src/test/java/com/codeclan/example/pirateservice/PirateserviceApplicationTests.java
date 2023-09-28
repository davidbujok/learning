package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired // This is called ** Dependency Injection **
	PirateRepository pirateRepository; // we need pirate repo in test because it's repo that's talking with db

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		pirateRepository.save(jack);
	}
	//@Test
	//public void bringPirateBack(){
	//	Pirate jack;
	//	jack = pirateRepository.findBy("name", "");
	//}
	@Test
	public void deletePirate(){
		//pirateRepository.findById(1L);
		pirateRepository.deleteById(2L);
		pirateRepository.deleteById(3L);
	}

}
