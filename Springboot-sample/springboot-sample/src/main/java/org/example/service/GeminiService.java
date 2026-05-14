package org.example.service;

import org.example.config.GeminiConfig;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class GeminiService {

    private final GeminiConfig config;

    public GeminiService(GeminiConfig config) {

        this.config = config;
    }

    public String askQuestion(String question) {

        String response = WebClient.builder().build().post()
                .uri(config.getApiUrl() + "?key=" + config.getApiKey())
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(Map.of(
                        "contents", new Object[]{
                                Map.of(
                                        "parts", new Object[]{
                                                Map.of("text", question)
                                        }
                                )
                        }
                ))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
    }
}