package com.atuka.customermanagement.service;

import com.atuka.customermanagement.exception.NotFoundException;
import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerRepository {
    List<Customer> customersList = Arrays
            .asList(new Customer(2L, "Jone", Customer.Gender.MALE, "+25191465656", 5L,"alemu@gmail.com"),
                    new Customer(3L, "Bilal", Customer.Gender.MALE, "+25191465656", 6L,"alemu@gmail.com"),
                    new Customer(4L, "Hasan", Customer.Gender.MALE, "+25191465656", 7L,"alemu@gmail.com"),
                    new Customer(6L, "Mohammed", Customer.Gender.MALE, "+25191465656", 8L,"alemu@gmail.com")
                    );


    @Override
    public List<Customer> getCustomers() {
        return customersList;
    }

    @Override
    public List<Customer> getCustomer(Long id) {
        return Collections.singletonList(customersList.stream()
                .filter(customerVal -> Objects.equals(customerVal.getCustomerID(), id))
                .findFirst().orElseThrow(
                        () -> new NotFoundException
                                ("Customer With ID "+id+" Not found")));

    }

}
