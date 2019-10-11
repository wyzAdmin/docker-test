package com.example.dockertest.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {


    @GetMapping("/docker")
    public ResponseEntity pushNote() {
        return ResponseEntity.ok("hello docker");
    }

}
