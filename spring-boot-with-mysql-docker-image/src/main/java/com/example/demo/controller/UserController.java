package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public String home() {
        return "Hello World!";
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userServiceImpl.saveUser(user);
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return userServiceImpl.findAll();
    }
}
