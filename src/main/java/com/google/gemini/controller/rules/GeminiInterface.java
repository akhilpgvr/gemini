package com.google.gemini.controller.rules;

import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiSearchResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface GeminiInterface {

    ResponseEntity<GeminiSearchResponse> askGemini(@RequestBody GeminiRequest request);
}
