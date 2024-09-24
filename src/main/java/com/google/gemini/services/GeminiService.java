package com.google.gemini.services;

import com.google.gemini.GeminiConnectionException;
import com.google.gemini.model.dtos.request.GeminiRequest;
import com.google.gemini.model.dtos.response.GeminiResponse;
import com.google.gemini.services.client.GoogleGeminiClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class GeminiService {

    @Value("${config.rest.metadata.key}")
    private String key;

    @Autowired
    private GoogleGeminiClient geminiClient;

    public GeminiResponse askGemini(GeminiRequest request) {

        log.info("Calling Gemini with request: {}", request);
        try{
            GeminiResponse response = geminiClient.askGemini(key, request);
            return response;
        }
        catch (Exception ex) {
            log.error("Gemini Client: {}, {}", ex.getMessage(), ex.getStackTrace());
            throw new GeminiConnectionException("Gemini not responding");
        }
    }
}
