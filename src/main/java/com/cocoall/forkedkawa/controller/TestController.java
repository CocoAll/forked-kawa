package com.cocoall.forkedkawa.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api( description="API de test.")
@RestController
@RequestMapping
@Component
public class TestController {

    @ApiOperation(value = "Test d'envoie d'un String")
    @GetMapping(value = "/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Test call api");
    }
    
}