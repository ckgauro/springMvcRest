package com.gauro.demo.services;

import com.gauro.demo.domain.Customer;
import com.gauro.demo.respositeries.CustomerRepository;

import java.util.List;

/**
 * @author Chandra
 */
public class CustomerServicesImpl implements CustomerServices {
    private final CustomerRepository customerRepository;

    public CustomerServicesImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return this.customerRepository.getOne(id);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }
}
