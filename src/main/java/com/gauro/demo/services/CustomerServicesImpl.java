package com.gauro.demo.services;

import com.gauro.demo.domain.Customer;
import com.gauro.demo.respositeries.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Chandra
 */
@Service
public class CustomerServicesImpl implements CustomerServices {
    private final CustomerRepository customerRepository;

    public CustomerServicesImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return this.customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
