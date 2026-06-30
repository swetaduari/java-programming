package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRequest;
import com.example.demo.service.CampusBotService;

@RestController
@RequestMapping("/api")
public class CampusBotController {

    @Autowired
    private CampusBotService campusBotService;

    @PostMapping("/ask")
    public ResponseEntity<String> ask(@RequestBody UserRequest request) {
        String answer = campusBotService.askAI(request.getQuestion());
        return ResponseEntity.ok(answer);
    }
}