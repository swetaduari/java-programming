package com.demo.controller;

import com.demo.dao.UserDAO;
import com.demo.exception.InvalidUserException;
import com.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public String openLogin(Model model) {

        model.addAttribute("user", new User());

        return "login";
    }

    @PostMapping("/validate")
    public String validateUser(
            @ModelAttribute("user") User user,
            Model model) {

        boolean status = userDAO.validateUser(
                user.getUsername(),
                user.getPassword());

        if (status) {

            model.addAttribute("username", user.getUsername());

            return "dashboard";
        } else {
            throw new InvalidUserException(
                    "Invalid Username or Password");
        }
    }

    @ExceptionHandler(InvalidUserException.class)
    public String handleInvalidUser(
            InvalidUserException ex,
            Model model) {

        model.addAttribute("msg", ex.getMessage());

        return "error";
    }
}