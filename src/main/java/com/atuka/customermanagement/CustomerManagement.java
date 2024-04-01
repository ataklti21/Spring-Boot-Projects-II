package com.atuka.customermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class CustomerManagement {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagement.class, args);
        System.out.println("this is test");
    }

}
