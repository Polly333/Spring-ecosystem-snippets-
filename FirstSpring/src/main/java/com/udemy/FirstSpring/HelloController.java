package com.udemy.FirstSpring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/home")

    public String hello(){
        return "You can do it Poulamee!";
    }

    @PostMapping("/home")
    public String greet(@RequestBody String name){
        return "Cheers" + name;
    }
}
