package com.revature.HelloSpringBoot.repositories;

import com.revature.HelloSpringBoot.models.Candy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface CandyRepository extends JpaRepository<Candy, Integer> {
}
