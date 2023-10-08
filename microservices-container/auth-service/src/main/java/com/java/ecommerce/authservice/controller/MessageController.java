package com.java.ecommerce.authservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/api/demo")
public class MessageController {

    @Value("${demo.message}")
    String message;

    @GetMapping
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
