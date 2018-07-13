package com.spr.service;

import com.spr.models.Role;
import com.spr.models.User;
import com.spr.repositories.RoleRepository;
import com.spr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("$2a$10$HqMjaXcGHDba2Gx8NeTYEu.9K08R4IYHozRaQCX9ayDklcJEgGEGu");

        return user;
    }

    @Override
    public User findByLogin(String login){
        return userRepository.findByLogin(login);
    }

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> rq = new HashSet<>();
        Role role = roleRepository.findOne(1L);
        role.getUsers().add(user);
        rq.add(role);
        user.setRoles(rq);
        userRepository.save(user);
    }

}
