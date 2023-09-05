package com.mohana.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/name")
    public String name() {
        return "Mohanashankari";
    }

    @GetMapping("/age")
    public String age() {
        return  "Twenty two";
    }

    @GetMapping("/address")
    public String address(){
        return "Bangalore";
    }


}
