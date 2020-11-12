package com.gauro.demo.bootstrap;

import com.gauro.demo.domain.Customer;
import com.gauro.demo.respositeries.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class BootStrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Loading Customer Data--->");

        Customer c1=new Customer();
        c1.setFirstName("Chandra");
        c1.setLastName("Gauro");
        customerRepository.save(c1);

        Customer c2=new Customer();
        c2.setFirstName("Sudeep");
        c2.setLastName("Sharma");
        customerRepository.save(c2);

        Customer c3=Customer.builder().firstName("Binay").lastName("Shakya").build();
        customerRepository.save(c3);
        log.info("Customer Saved: "+ customerRepository.count());


    }
}
