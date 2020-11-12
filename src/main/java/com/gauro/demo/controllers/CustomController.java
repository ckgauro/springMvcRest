package com.gauro.demo.controllers;

import com.gauro.demo.domain.Customer;
import com.gauro.demo.services.CustomerServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Chandra
 */
@RestController
@RequestMapping(CustomController.BASE_URL)
public class CustomController {
    public static final String BASE_URL="/api/v1/customers";
    private final CustomerServices customerServices;

    public CustomController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerServices.findAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id){
        return  customerServices.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCUSTOMER(@RequestBody  Customer customer){
        return  customerServices.saveCustomer(customer);
    }
}
