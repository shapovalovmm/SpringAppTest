package com.example.demo.service;

import com.example.demo.repository.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    public List<User> helloWorld() {
        return List.of(
                new User(1L, "Max", "shapovalov3334@gmail.com", LocalDate.of(1993, 02, 18), 19),
                new User(2L, "Daniel", "dankul2005@gmail.com", LocalDate.of(1990, 03, 8), 19),
                new User(3L, "Eugene", "eugen228@gmail.com", LocalDate.of(1991, 12, 19), 19)
        );
    }
}
