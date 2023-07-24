package com.rayaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // specifies that this is a springtboot application
@RestController // required for API endpoint
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet") // allows users to use as Rest endpoint
    public GreetResponse greet() {
        return new GreetResponse("Hello");
    }

    record GreetResponse(String greet){}
}
