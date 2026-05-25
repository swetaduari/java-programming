package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showLogin(Model model) {

        model.addAttribute("user", new User());

        return "login";
    }

    @PostMapping("/login")
    public String login(
            @ModelAttribute("user") User user,
            Model model) {

        boolean valid = userService.login(
                user.getUsername(),
                user.getPassword()
        );

        if (valid) {
            model.addAttribute("username", user.getUsername());
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid Username or Password");
            return "login";
        }
    }
}
