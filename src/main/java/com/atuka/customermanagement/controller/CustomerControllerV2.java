package com.atuka.customermanagement.controller;

import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v2/customer")
@Deprecated
public class CustomerControllerV2 {
    @Autowired
    private final CustomerService customerService;

    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
    public List<Customer> getCustomers() {
        return List.of(new Customer(2L, "Tesema", Customer.Gender.MALE, "+25191465656", 5L, "alemu@gmail.com"), new Customer(3L, "Bekelle", Customer.Gender.MALE, "+25191465656", 6L, "alemu@gmail.com"), new Customer(4L, "Gebre", Customer.Gender.MALE, "+25191465656", 7L, "alemu@gmail.com"), new Customer(6L, "Haftay", Customer.Gender.MALE, "+25191465656", 8L, "alemu@gmail.com"));

    }

    @GetMapping(value = "{customerId}")
    public Customer getCustomer(@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        System.out.println("Creating A customer");
        return customer;
    }

    @PutMapping(value = "{Id}")
    public Customer editCustomer(@RequestBody Customer customer, @PathVariable Long Id) {
        System.out.println("Updating Customer Value");
        return customer;
    }

    @DeleteMapping(value = "{Id}")
    public void DeleteCustomer(@PathVariable Long Id) {
        System.out.println("Deleting Customer" + Id);
    }
}
