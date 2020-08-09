package com.example.jenkinsDemo.controller;

import model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class usersController {

    @GetMapping(value = "/users", produces = "application/json")
    public ArrayList<Users> getUserNames() {
        Users u = new Users(1, "Jack");
        Users u1 = new Users(2, "Jone");
        ArrayList<Users> users = new ArrayList<>();
        users.add(u);
        users.add(u1);
        return users;
    }

}
