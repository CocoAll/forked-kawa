package com.cocoall.forkedkawa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class TestController {

    @GetMapping(value = "/test")
    public String getTest() {
        return "Test call api";
    }
}
