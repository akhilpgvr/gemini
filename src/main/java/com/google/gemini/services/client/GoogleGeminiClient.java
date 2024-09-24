package com.google.gemini.services.client;

import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "GoogleGeminiApi", url = "${config.rest.service.google-gemini-url}")
public interface GoogleGeminiClient {

    @PostMapping
    GeminiResponse askGemini(@RequestParam String key, @RequestBody GeminiRequest request);

}
