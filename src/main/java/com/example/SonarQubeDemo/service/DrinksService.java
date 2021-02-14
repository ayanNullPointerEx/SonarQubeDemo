package com.example.SonarQubeDemo.service;

import org.springframework.stereotype.Service;

@Service
public class DrinksService {

    public String getDrink(String choice) {
        String output;
        switch (choice){
            case "cocacola": output="Welcome !! U r entitled to cocacola"; break;
            case "pepsi": output="Welcome !! U r entitled to pepsi"; break;
            case "mirinda": output="Welcome !! U r entitled to mirinda"; break;
            default: output = "Welcome !! U r entitled to mineral water";
        }
        return output;
    }
}
