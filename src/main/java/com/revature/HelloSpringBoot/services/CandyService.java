package com.revature.HelloSpringBoot.services;

import com.revature.HelloSpringBoot.models.Candy;

import java.util.List;

public interface CandyService {
    // Basic crud business logic
    public Candy createCandy(Candy c);

    public List<Candy> getAll();

    public Candy editCandy(Candy c);
//
    public void deleteCandyById(int candyId);
}
