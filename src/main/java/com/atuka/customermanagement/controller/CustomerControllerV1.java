package com.atuka.customermanagement.controller;

import com.atuka.customermanagement.exception.ApiRequestException;


import com.atuka.customermanagement.exception.NotFoundException;
import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerControllerV1 {
    @Autowired
    private final CustomerService customerService;

    public CustomerControllerV1(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public List<Customer> getCustomers() {
        return customerService
                .getCustomers();
    }

    @GetMapping(path = "{customerId}")
    public Customer getCustomer(@PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "{customerId}/exception")
    public List<Customer> getCustomerException(@PathVariable Long customerId) {
        throw new
                ApiRequestException("ApiRequestException for customer "+customerId);
    }

    @PostMapping
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("Creating A customer");
        return customer;
    }

    @PutMapping(value = "{Id}")
    public Customer editCustomer(@RequestBody Customer customer,
                                 @PathVariable Long Id) {
        System.out.println("Updating Customer Value");
        return customer;
    }

    @DeleteMapping(value = "{Id}")
    public void DeleteCustomer(@PathVariable Long Id) {
         System.out.println("Deleting Customer" + Id);
    }

}
