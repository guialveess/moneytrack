package com.cesar.moneytrack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/api/health-check")
public class HealthController {

    @GetMapping(value = "/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok(
                "{\"status\":\"OK\",\"timestamp\":\"" + LocalDateTime.now() + "\"}"
        );
    }
}
