package com.atuka.customermanagement.controller;

import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class Controller {
    @Autowired
    private final CustomerService customerService;

    public Controller(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody  Customer customer) {
        System.out.println("Creating A customer");
        return customer;
    }

    @PutMapping(value = "{Id}")
    public Customer editCustomer(@RequestBody Customer customer,@PathVariable Long Id){
        System.out.println("Updating Customer Value");
        return customer;
    }
    @DeleteMapping(value = "{Id}")
    public void DeleteCustomer(@PathVariable  Long Id){
        System.out.println("Deleting Customer"+Id);
    }
}
