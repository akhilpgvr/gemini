package com.google.gemini.controller;

import com.google.gemini.controller.rules.GeminiInterface;
import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiResponse;
import com.google.gemini.services.GeminiService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/gemini")
public class GeminiController implements GeminiInterface {


    @Autowired
    private GeminiService geminiService;

    @Override
    @Operation(summary = "test api", description = "")
    @PostMapping("/gemini")
    public ResponseEntity<GeminiResponse> askGemini(@RequestBody GeminiRequest request) {
        return new ResponseEntity<>(geminiService.askGemini(request), HttpStatus.OK);
    }

}
