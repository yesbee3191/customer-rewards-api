package com.charter.customerrewards.service;

import com.charter.customerrewards.builder.CustomerrewardsBuiilder;
import com.charter.customerrewards.entity.Customer;
import com.charter.customerrewards.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerrewardsService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerrewardsBuiilder customerrewardsBuiilder;

    public void customerService(){
        List<Customer> customers = customerRepository.findAll();
        Set<String> cusNames =  customers.stream().map(e -> e.getName()).collect(Collectors.toSet());
        customerrewardsBuiilder.customerInfoBuild(customers,cusNames);

    }
}
