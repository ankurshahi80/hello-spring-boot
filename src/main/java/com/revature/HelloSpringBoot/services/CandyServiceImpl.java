package com.revature.HelloSpringBoot.services;
//
import com.revature.HelloSpringBoot.models.Candy;
import com.revature.HelloSpringBoot.repositories.CandyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CandyServiceImpl implements CandyService{
//
    @Autowired
    private CandyRepository candyRepo;

    @Override
    public Candy createCandy(Candy c) {
        Candy newCandy = candyRepo.save(c);
        return newCandy;
    }

    @Override
    public List<Candy> getAll() {
        return candyRepo.findAll();
    }

    @Override
    @Transactional
    public Candy editCandy(Candy c) {
        Candy target = candyRepo.findById(c.getId()).get();

        target.setName(c.getName());
        target.setDescription(c.getDescription());
        target.setPrice(c.getPrice());

        return target;
    }

    @Override
    @Transactional
    public void deleteCandyById(int candyId) {
        Candy target = candyRepo.getById(candyId);
        candyRepo.delete(target);
    }
}
