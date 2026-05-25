package com.example.service;

import com.example.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public boolean login(String username, String password) {
        return userDAO.validateUser(username, password);
    }
}
