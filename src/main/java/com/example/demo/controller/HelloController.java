package com.example.demo.controller;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;


@RestController
@Tag(name = "Hello API", description = "Demo endpoints") //for swagger documentation
public class HelloController {


    @GetMapping("/api/hello")

    @Operation(
            summary = "Hello endpoint",                  //for swagger documentation
            description = "Returns a simple greeting to verify the API is working"
    )

    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring Boot");
    }

}
