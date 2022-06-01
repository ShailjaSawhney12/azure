package com.example.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/name")
    public String getName(){

        System.out.println("Shailja here");
        return "Hi there";
    }
}
