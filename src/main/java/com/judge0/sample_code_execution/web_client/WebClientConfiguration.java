package com.judge0.sample_code_execution.web_client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
//There is a lot more configuration that can be done, if needed
@Configuration
public class WebClientConfiguration {

    private static final String BASE_URL = "https://ce.judge0.com";

    @Bean
    public WebClient webClient(){
        return WebClient.create(BASE_URL);
    }
}
