package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.AIResponse;

@Service
public class CampusBotService {

    @Value("${openai.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public AIResponse askQuestion(String question) {

        String url = "https://api.openai.com/v1/chat/completions";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        String body = String.format("""
                {
                  "model": "gpt-4o-mini",
                  "messages": [
                    {
                      "role": "user",
                      "content": "%s"
                    }
                  ]
                }
                """, question);

        HttpEntity<String> entity = new HttpEntity<>(body, headers);

        try {

            ResponseEntity<Map> response = restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    entity,
                    Map.class);

            Map responseBody = response.getBody();

            var choices = (java.util.List<?>) responseBody.get("choices");
            var firstChoice = (Map<?, ?>) choices.get(0);
            var message = (Map<?, ?>) firstChoice.get("message");

            String answer = message.get("content").toString();

            return new AIResponse(
                    answer,
                    "gpt-4o-mini",
                    LocalDateTime.now().toString());

        } catch (Exception e) {

            return new AIResponse(
                    "Unable to connect to AI service. Please try again later.",
                    "N/A",
                    LocalDateTime.now().toString());
        }
    }
}