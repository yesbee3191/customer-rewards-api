package com.charter.customerrewards.service;

import com.charter.customerrewards.entity.Customer;
import com.charter.customerrewards.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerrewardsService {

    @Autowired
    CustomerRepository customerRepository;

    public void customerService(){
        List<Customer> customers = customerRepository.findAll();
    }
}
