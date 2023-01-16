package com.practice.spring.boot.demo.springbootdemoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject props
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String coachTeam;


    // expose a "/" that return "Hello"
    @GetMapping("/")
    public String hello(){
        return "Hello World, Welcome to Spring Boot!!";
    }
    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5k!";
    }

    // expose team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "The team info is: "+ coachName +" -- " + coachTeam;
    }
}
