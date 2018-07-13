package com.spr.controllers;

import com.spr.models.User;
import com.spr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping
@RestController
public class UsersController {

    private final UserRepository userRepository;

    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/allUsers")
    public List<User> getAllUsers(){
        List<User> users = userRepository.findAll();
        users.forEach(from -> from.setRoles(null));
        return users;
    }

}
