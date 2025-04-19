package com.udemy.FirstSpring;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    //@GetMapping("/home")
//    public String hello(){
//        return "You can do it Poulamee!";
//    }

    @GetMapping("/home")
    public HelloResponse hello(){
        //Getting JSON response
        return new HelloResponse("You can do it Poulamee!");

    }

    //dynamic url
    @GetMapping("/hi/{pet}/show")  //can have /home/{pet} only
    public HelloResponse helloparam(@PathVariable String pet){
        // the param name should be same as the @GetMapping var name
        return new HelloResponse("You can do it Poulamee!");
        //can use the param pet 

    }

//    @PostMapping("/home")
//    public String greet(@RequestBody String name){
//        return "Cheers " + name;
//    }


    @PostMapping("/hello")
    public HelloResponse greet (@RequestBody String name){
        return new HelloResponse("Cheers " + name);
    }
}
