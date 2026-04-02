package com.example.demo.service;


import com.example.demo.dto.GreetingRequest;
import com.example.demo.dto.GreetingResponse;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingResponse greet(GreetingRequest request) {
        return new GreetingResponse(
                "Helloassssssssssssss " + request.getName()
        );
    }
}

