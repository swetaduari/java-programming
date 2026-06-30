package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AIResponse;
import com.example.demo.dto.QuestionRequest;
import com.example.demo.service.CampusBotService;

@RestController
@RequestMapping("/api")
public class CampusBotController {

    @Autowired
    private CampusBotService service;

    @PostMapping("/ask-question")
    public ResponseEntity<AIResponse> askQuestion(
            @RequestBody QuestionRequest request) {

        return ResponseEntity.ok(
                service.askQuestion(request.getQuestion()));
    }
}