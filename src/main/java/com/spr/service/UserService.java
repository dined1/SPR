package com.spr.service;

import com.spr.models.User;
import com.spr.models.UserDto;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void delete(long id);

    User findById(Long id);

    User findByLogin(String login);

    User save(UserDto user);
}