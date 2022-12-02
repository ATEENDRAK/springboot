package com.scaler.springProject;

import com.scaler.springProject.pojos.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController("/users")
@RequestMapping("/users")
public class UserController {
    ArrayList<User> users = new ArrayList<>();
    @GetMapping("/")
    public ArrayList<User> getUsers(){
        return users;
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable String id){
        return users.get(Integer.parseInt(id));
    }

    @PostMapping("/")
    public String addUser(@RequestBody User user){
        users.add(user);
        return "Successfully added user";
    }
}
