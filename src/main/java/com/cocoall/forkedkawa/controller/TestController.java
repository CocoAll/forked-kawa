package com.cocoall.forkedkawa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Component
public class TestController {

    @GetMapping(value = "/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Test call api");
    }
}
/*
* REGARDE POUR INTEGRER JACKSON POUR LES WEBSERVICES !!!!!
 */