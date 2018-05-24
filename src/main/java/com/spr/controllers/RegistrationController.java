package com.spr.controllers;

import com.spr.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String newUser(@ModelAttribute("userForm") User userForm){
        return "redirect:/start";
    }

}
