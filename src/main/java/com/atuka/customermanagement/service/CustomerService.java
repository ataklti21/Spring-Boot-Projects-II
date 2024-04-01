package com.atuka.customermanagement.service;

import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerRepository {
    @Override
    public List<Customer> getCustomer() {
        return List.of(new Customer(2L, "Jone", Customer.Gender.MALE, "+25191465656", 5L), new Customer(3L, "Bilal", Customer.Gender.MALE, "+25191465656", 6L), new Customer(4L, "Hasan", Customer.Gender.MALE, "+25191465656", 7L), new Customer(6L, "Mohammed", Customer.Gender.MALE, "+25191465656", 8L));
    }
}
