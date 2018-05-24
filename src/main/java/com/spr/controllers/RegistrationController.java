package com.spr.controllers;

import com.spr.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String newUser(User user){
        return "redirect:/start";
    }

}
