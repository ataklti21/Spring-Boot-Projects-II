package com.atuka.customermanagement.service;

import com.atuka.customermanagement.exception.NotFoundException;
import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //this Returns all customers from the database
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {

        return customerRepository.findById(id).orElseThrow(
                ()->new NotFoundException
                        ("Customer with this Id is not in the list"));
    }

    public List<Customer> creatCustomer(Customer customer) {
        customerRepository.save(customer);
        return customerRepository.findAll();
    }

    public List<Customer> deleteCustomer(Long id) {
        customerRepository.deleteById(id);
        return customerRepository.findAll();
    }
}
