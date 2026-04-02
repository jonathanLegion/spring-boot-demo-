package com.example.demo.dto;


public class GreetingResponse {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public GreetingResponse(String s) {
    this.message = s;
    }
}

