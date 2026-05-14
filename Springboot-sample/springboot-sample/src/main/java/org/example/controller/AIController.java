package org.example.controller;

import org.example.service.GeminiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final GeminiService geminiService;

    public AIController(GeminiService aiService) {
        this.geminiService = aiService;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam String question) {
        return geminiService.askQuestion(question);
    }
}

