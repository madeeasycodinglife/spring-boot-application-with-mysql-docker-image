package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> findAll();
}
