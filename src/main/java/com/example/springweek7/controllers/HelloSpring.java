package com.example.springweek7.controllers;

import com.example.springweek7.services.CalculateDayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    CalculateDayOfWeek dayOfWeek = new CalculateDayOfWeek();

    @GetMapping("")
    public String introduction(){
        return "List of commands: /hello - /endpoint?= - /wwwerdetfredagdk";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/endpoint")
    public String endpoint(@RequestParam String input){
        return "The input was " + input;
    }

    @GetMapping("/wwwerdetfredagdk")
    public String wwwerdetfredagdk(){
        int d = dayOfWeek.date();
        boolean fredag = false;
        if(d == 5){
            fredag = true;
        }
        if(fredag){
            return "I dag er det fredag";
        } else {
            return "I dag er det ikke fredag";
        }
    }
}
