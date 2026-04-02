package com.example.demo.controller;



import com.example.demo.dto.GreetingRequest;
import com.example.demo.dto.GreetingResponse;
import com.example.demo.service.GreetingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


 //comment just to create qa env - this comment was to get qa initialized on the repo
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@Tag(name = "Hello API", description = "Demo endpoints") //for swagger documentation
@SecurityRequirement(name = "bearerAuth") // 👈 Swagger only
public class HelloController {

    private final GreetingService service;

    public HelloController(GreetingService service) {
        this.service = service;
    }


    @GetMapping("/api/hello")

    @Operation(
            summary = "Hello endpoint",                  //for swagger documentation
            description = "Returns a simple greeting to verify the API is working"
    )
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring Boot");
    }

    @GetMapping("/api/bye")

    @Operation(
            summary = "bye endpoint",                  //for swagger documentation
            description = "Returns a simple greeting to verify the API is working"
    )
    public Map<String, String> bye() {
        return Map.of("message", "tata from Spring Boot");
    }


    @PostMapping(
            value = "/api/greet",
            produces = "application/json",
            consumes = "application/json")

    public GreetingResponse greet(@RequestBody GreetingRequest request) {
        return service.greet(request);
    }


    @PostMapping(
            value = "/api/simple-post",
            consumes = "application/json",
            produces = "application/json"
    )
    public Map<String, String> simplePost(@RequestBody Map<String, String> body) {
        return Map.of(
                "status", "OKish",
                "received", body.getOrDefault("value", "nothing")
        );
    }



}
