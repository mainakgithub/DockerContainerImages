package com.niit.customerservice.CustomerService.service;

import com.niit.customerservice.CustomerService.domain.Customer;
import com.niit.customerservice.CustomerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }


    @Override
    public Customer saveCustomerDetail(Customer customer) throws Exception {
        if (customerRepository.findById(customer.getCustomerId()).isPresent())
        {
            throw new Exception();
        }
        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(int customerCode) throws Exception {
        boolean flag=false;
        if (customerRepository.findById(customerCode).isEmpty())
        {
            throw new Exception();
        }
        else
        {
            customerRepository.deleteById(customerCode);
            flag=true;
        }
        return flag;
    }

    @Override
    public List<Customer> getAllCustomerDetail() {
        return customerRepository.findAll();
    }

}

