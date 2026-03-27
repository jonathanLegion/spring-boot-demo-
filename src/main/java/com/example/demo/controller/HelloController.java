package com.example.demo.controller;



import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


 //comment just to create qa env
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@Tag(name = "Hello API", description = "Demo endpoints") //for swagger documentation
@SecurityRequirement(name = "bearerAuth") // 👈 Swagger only
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
