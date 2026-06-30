package com.example.demo.service;

import com.example.demo.model.OpenAIResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.time.Duration;

@Service
public class CampusBotService {

    @Value("${openai.api.key}")
    private String apiKey;

    @Value("${openai.api.url}")
    private String apiUrl;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String askAI(String question) {

        try {

            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            String json = """
                    {
                      "model":"gpt-4o-mini",
                      "messages":[
                        {
                          "role":"user",
                          "content":"%s"
                        }
                      ]
                    }
                    """.formatted(question);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                return "Error: " + response.statusCode();
            }

            OpenAIResponse aiResponse =
                    objectMapper.readValue(response.body(), OpenAIResponse.class);

            return aiResponse.getChoices()
                    .get(0)
                    .getMessage()
                    .getContent();

        } catch (HttpTimeoutException e) {
            return "Request timed out.";

        } catch (IOException e) {
            return "Network error: " + e.getMessage();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Request interrupted.";

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}