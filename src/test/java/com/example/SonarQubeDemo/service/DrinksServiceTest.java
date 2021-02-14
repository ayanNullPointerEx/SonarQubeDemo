package com.example.SonarQubeDemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinksServiceTest {

    @Test
    void getDrink() {
        DrinksService drinksService = new DrinksService();
        String output = drinksService.getDrink("cocacola");
        assertEquals(output,"Welcome !! U r entitled to cocacola");
    }
}