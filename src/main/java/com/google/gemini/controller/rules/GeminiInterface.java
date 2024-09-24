package com.google.gemini.controller.rules;

import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface GeminiInterface {

    ResponseEntity<GeminiResponse> askGemini(@RequestBody GeminiRequest request);
}
