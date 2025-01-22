package com.maico.LiterAlura.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class GutendexClient {

    private final WebClient webClient;

    public GutendexClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://gutendex.com/books/").build();
    }

    public GutendexResponse getBooksByTitle(String title) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("title", title).build())
                .retrieve()
                .bodyToMono(GutendexResponse.class)
                .block();
    }
}