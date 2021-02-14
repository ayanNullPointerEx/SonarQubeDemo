package com.example.SonarQubeDemo.controller;

import com.example.SonarQubeDemo.service.DrinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    DrinksService drinksService;

    @GetMapping("/welcome")
    public String welcome(@RequestParam("welcomeDrink") String welcomeDrink) {
        return drinksService.getDrink(welcomeDrink);
    }
}
