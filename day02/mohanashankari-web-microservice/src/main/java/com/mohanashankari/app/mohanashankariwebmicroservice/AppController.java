package com.mohanashankari.app.mohanashankariwebmicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class AppController {

    @GetMapping("/get")
    public String getData(){
        return "get data";
    }

}
