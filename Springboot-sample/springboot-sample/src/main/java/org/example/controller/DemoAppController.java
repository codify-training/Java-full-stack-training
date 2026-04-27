package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAppController {

    @GetMapping("/hello")
    public String hello(){
            return "!!! Welcome to Spring boot Application !!! ";
    }

}
