package com.example.demo.dto;

public class AIResponse {

    private String answer;
    private String model;
    private String timestamp;

    public AIResponse() {
    }

    public AIResponse(String answer, String model, String timestamp) {
        this.answer = answer;
        this.model = model;
        this.timestamp = timestamp;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}