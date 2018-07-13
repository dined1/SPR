package com.spr.service;

import com.spr.models.User;

public interface UserService {

    User getUser(String login);

    User findByLogin(String login);

    void save(User user);
}