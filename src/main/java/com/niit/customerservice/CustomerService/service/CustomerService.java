package com.niit.customerservice.CustomerService.service;

import com.niit.customerservice.CustomerService.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomerDetail(Customer customer) throws Exception;
    boolean deleteCustomer(int id) throws Exception;
    List<Customer> getAllCustomerDetail();

}
