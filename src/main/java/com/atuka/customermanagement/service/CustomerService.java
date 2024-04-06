package com.atuka.customermanagement.service;

import com.atuka.customermanagement.exception.NotFoundException;
import com.atuka.customermanagement.model.Customer;
import com.atuka.customermanagement.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;

    //Constructor Injection
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * this Methode is intended to return all customers
     *
    * @return List<Customer>
     */
    //this Returns all customers from the database
    public List<Customer> getCustomers() {
        LOGGER.info("getCustomers Method was called");
        return customerRepository.findAll();
    }

    /**
     * this Methode is intended to return a customer
     * takes Customer Id as a parameter and returns
     * specific customer
     *
     * @param id
     * @return
     */
    public Customer getCustomer(Long id) {

        return customerRepository.findById(id).orElseThrow(() -> {
            NotFoundException notFoundException = new NotFoundException("Customer Not found");
            LOGGER.error("Error getting Customer {}", id, notFoundException);
            return notFoundException;

        });
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
