package com.scaler.springProject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HelloController {
    ArrayList<String> greetings=new ArrayList<>();
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id){
        if(greetings.size()==0 || Integer.parseInt(id) >=greetings.size())
            return "Hello World " + id;
        return greetings.get(Integer.parseInt(id));
    }

    @PostMapping("/greeting")
    public void greeting(@RequestParam String greeting){
        if(greeting.length()>0)
            greetings.add(greeting);
        System.out.println(greeting);
    }
}
