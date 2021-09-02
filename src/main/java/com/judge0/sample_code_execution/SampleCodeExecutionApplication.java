package com.judge0.sample_code_execution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
