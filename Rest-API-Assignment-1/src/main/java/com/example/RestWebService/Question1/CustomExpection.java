package com.example.RestWebService.Question1;

public class CustomExpection {
    private String message;

    public CustomExpection(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
