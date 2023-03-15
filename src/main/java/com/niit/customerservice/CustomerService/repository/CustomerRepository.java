package com.niit.customerservice.CustomerService.repository;

import com.niit.customerservice.CustomerService.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,Integer> {

}
