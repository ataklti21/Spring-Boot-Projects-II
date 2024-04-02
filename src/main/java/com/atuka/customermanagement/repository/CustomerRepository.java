package com.atuka.customermanagement.repository;

import com.atuka.customermanagement.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<Customer> getCustomers();
    List<Customer> getCustomer(Long id);
}
