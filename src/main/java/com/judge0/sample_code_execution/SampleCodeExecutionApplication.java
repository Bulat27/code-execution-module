package com.judge0.sample_code_execution;

import com.judge0.sample_code_execution.model.Response;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SampleCodeExecutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleCodeExecutionApplication.class, args);
    }

    //This is probably not the place for this, but it's okay in the sample project.
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate){
//        return args -> {
//            Response response =
//                    restTemplate.getForObject("https://ce.judge0.com/submissions/552baef6-0979-488c-81de-dd90c8a58dae?base64_encoded=false&fields=*", Response.class);
//            System.out.println(response);
//        };
//    }
}
