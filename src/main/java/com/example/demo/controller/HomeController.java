package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping
@Log4j2
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity("Hello Spring Boot", HttpStatus.OK);
    }

    @GetMapping("/log/info")
    public ResponseEntity<String> logInfo() {
        log.info("logging info");
        return new ResponseEntity("Logging Info", HttpStatus.OK);
    }


    @GetMapping("/log/warn")
    public ResponseEntity<String> logWarn() {
        log.warn("logging warn");
        return new ResponseEntity("Logging Warn", HttpStatus.OK);
    }


    @GetMapping("/log/error")
    public ResponseEntity<String> logError() {
        log.error("logging error");
        return new ResponseEntity("Logging Error", HttpStatus.OK);
    }
}
