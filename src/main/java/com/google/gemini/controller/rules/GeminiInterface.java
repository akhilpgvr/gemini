package com.google.gemini.controller.rules;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface GeminiInterface {
    ResponseEntity<String> getGreeting(@RequestParam String name);
}
