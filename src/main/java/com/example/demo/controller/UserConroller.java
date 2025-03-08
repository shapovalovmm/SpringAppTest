package com.example.demo.controller;

import com.example.demo.repository.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class UserConroller {
    private final UserService userService;

    public UserConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> helloWorld() {
        return userService.helloWorld();
    }

}
