package com.biscuits.Tea_and_Biscuits.repositories;

import com.biscuits.Tea_and_Biscuits.models.Biscuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiscuitRepository extends JpaRepository<Biscuit, Long> {

}
