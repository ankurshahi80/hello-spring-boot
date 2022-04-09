package com.revature.HelloSpringBoot.controllers;

//import com.revature.HelloSpringBoot.model.Candy;
//import com.revature.HelloSpringBoot.services.CandyService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Profile("prod")
public class ProductionController {

//    @Autowired
//    private CandyService candyService;

    @GetMapping("/test")
    public String test(){
        return "this is a test endpoint";
    }

//    @GetMapping("/all")
//    public List<Candy> getAllCandies(){
//        return candyService.getAll();
//    }
//
//    @PostMapping("/create")
//    public Candy createNewCandy(@RequestBody Candy candy){
//        Candy newCandy = candyService.createCandy(candy);
//        return newCandy;
//    }
//
//    @PutMapping("/edit")
//    public Candy editCandy(Candy target){
//        return candyService.editCandy(target);
//    }
//
//    @DeleteMapping("/delete")
//    public void deleteCandyById(int candyId){
//        candyService.deleteCandyById(candyId);
//    }
}
