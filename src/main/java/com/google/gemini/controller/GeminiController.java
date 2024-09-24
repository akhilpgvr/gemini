package com.google.gemini.controller;

import com.google.gemini.controller.rules.GeminiInterface;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/gemini")
public class GeminiController implements GeminiInterface {


    @Override
    @Operation(summary = "test api", description = "")
    @PostMapping("/test")
    public ResponseEntity<String> getGreeting(@RequestParam String name) {
        return new ResponseEntity<>("Hello "+ name, HttpStatus.OK);
    }

}
