package com.codeclan.example.pirateservice.repositories;
import com.codeclan.example.pirateservice.models.Pirate; // don't forget to import your model!!
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
