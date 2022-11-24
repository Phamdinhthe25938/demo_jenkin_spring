package com.example.demo_jenkin_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJenkinSpringApplication.class, args);
    }

    @GetMapping("/get")
    public  String getData () {
        return "hello";
    }
}
