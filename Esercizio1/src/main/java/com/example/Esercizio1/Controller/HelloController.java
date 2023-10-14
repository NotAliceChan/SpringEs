package com.example.Esercizio1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/esercizio")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello World!");
    }
}