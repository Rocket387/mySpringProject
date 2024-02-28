package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //getmapping makes the method below execute every time the app receives a get request to /helloworld endpoint
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
