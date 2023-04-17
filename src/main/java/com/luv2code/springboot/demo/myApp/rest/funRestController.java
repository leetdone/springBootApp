package com.luv2code.springboot.demo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    //expose "/" that return "hello world"
    @GetMapping("/")
    public String sayHi(){
        return "Hi";
    }

    @GetMapping("/dev")
    public String devTest(){
        return "dev Worksdgg?";
    }
}
