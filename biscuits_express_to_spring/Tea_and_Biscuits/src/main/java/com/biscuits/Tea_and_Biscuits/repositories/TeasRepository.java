package com.biscuits.Tea_and_Biscuits.repositories;

import com.biscuits.Tea_and_Biscuits.models.Tea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeasRepository extends JpaRepository<Tea, Long> {
}
