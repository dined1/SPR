package com.spr.service;

import com.spr.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("$2a$10$HqMjaXcGHDba2Gx8NeTYEu.9K08R4IYHozRaQCX9ayDklcJEgGEGu");

        return user;
    }

}
