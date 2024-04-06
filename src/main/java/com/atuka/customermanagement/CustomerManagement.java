package com.atuka.customermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class CustomerManagement {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagement.class, args);
        System.out.println("this is test");
    }
    @FeignClient("name")
    static interface NameService {
        @RequestMapping("/")
        public String getName();
    }
}
