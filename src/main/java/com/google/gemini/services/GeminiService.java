package com.google.gemini.services;

import com.google.gemini.exception.GeminiConnectionException;
import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiResponse;
import com.google.gemini.model.dtos.response.GeminiSearchResponse;
import com.google.gemini.model.dtos.response.Part;
import com.google.gemini.services.client.GoogleGeminiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GeminiService {

    @Value("${config.rest.metadata.key}")
    private String key;

    @Autowired
    private GoogleGeminiClient geminiClient;

    public GeminiSearchResponse askGemini(GeminiRequest request) {

        log.info("Calling Gemini with request: {}", request);
        try{
            GeminiResponse response = geminiClient.askGemini(key.replace("@", ""), request);
            return new GeminiSearchResponse(new Part(response.getCandidates().getFirst().getContent().getParts().getFirst().getText()));
        }
        catch (Exception ex) {
            log.error("Gemini Client: {}, {}", ex.getMessage(), ex.getStackTrace());
            throw new GeminiConnectionException("Gemini not responding");
        }
    }
}
