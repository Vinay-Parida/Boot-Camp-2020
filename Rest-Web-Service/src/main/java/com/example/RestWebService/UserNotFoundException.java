package com.example.RestWebService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Part-1-Q6 Implement Exception Handling for resource not found

@ResponseStatus(HttpStatus.NOT_FOUND)                                   //Without this status shows: 500 Internal server error. But actually its is error due to not getting the resourse
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
