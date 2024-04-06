package com.atuka.customermanagement.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfig {
    @Bean(value = "jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient placeHolderClient) {
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/");
            System.out.println(placeHolderClient.getPosts().size());
            //System.out.println(placeHolderClient.getPosts());
            System.out.println("https://jsonplaceholder.typicode.com/post/1");
            System.out.println(placeHolderClient.getPost(1L));
        };
    }
}
