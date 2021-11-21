package com.example.dockerdemo.controllers;

import com.example.dockerdemo.dao.UserDAO;
import com.example.dockerdemo.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/users")
public class UserController {
    private final UserDAO userDAO;

    @GetMapping()
    public List<User> getAll(){
        return userDAO.findAll();
    }

    @PostMapping("/save")
    public User create(@RequestBody User user)
    {
        return userDAO.save(user);

    }


}
