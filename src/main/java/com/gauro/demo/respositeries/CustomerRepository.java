package com.gauro.demo.respositeries;

import com.gauro.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Chandra
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
