package com.gauro.demo.services;

import com.gauro.demo.domain.Customer;

import java.util.List;

/**
 * @author Chandra
 */
public interface CustomerServices {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomer();

}
