package com.atuka.customermanagement.repository;

import com.atuka.customermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository
        extends JpaRepository<Customer,Long> {

}
