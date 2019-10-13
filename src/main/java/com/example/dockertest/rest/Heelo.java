package com.example.dockertest.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/hello/")
public class Heelo {


    @GetMapping("/info")
    public ResponseEntity userInfo() {
        return ResponseEntity.ok("hello wyz");
    }
}
