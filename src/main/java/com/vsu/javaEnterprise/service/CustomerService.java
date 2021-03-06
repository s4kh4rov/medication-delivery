package com.vsu.javaEnterprise.service;

import com.vsu.javaEnterprise.domain.Customer;
import com.vsu.javaEnterprise.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer getById(Long id){
        return customerRepository.getCustomerById(id);
    }
}
