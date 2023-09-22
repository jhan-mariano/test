package com.example.test;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    @Operation(summary = "Simple get method")
    @ApiResponse(responseCode = "200", description = "get operation sucesss")
    public ResponseEntity<Void> test() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
