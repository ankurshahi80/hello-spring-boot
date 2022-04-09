package com.revature.HelloSpringBoot.controllers;

import com.revature.HelloSpringBoot.services.CandyService;
import org.springframework.beans.factory.annotation.Autowired;
import com.revature.HelloSpringBoot.models.Candy;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Profile("prod")
@RequestMapping("/candy")
public class ProductionController {

    @Autowired
    private CandyService candyService;

    @GetMapping("/test")
    public String test(){
        return "this is a test endpoint";
    }

    @GetMapping("")
    public List<Candy> getAllCandies(){
        return candyService.getAll();
    }

    @PostMapping("")
    public Candy createNewCandy(@RequestBody Candy candy){
        Candy newCandy = candyService.createCandy(candy);
        return newCandy;
    }

    @PutMapping("")
    public Candy editCandy(@RequestBody Candy target){
        return candyService.editCandy(target);
    }

    @DeleteMapping("{candy_id}")
    public void deleteCandyById(@PathVariable ("candy_id") int candyId){
        candyService.deleteCandyById(candyId);
    }
}
