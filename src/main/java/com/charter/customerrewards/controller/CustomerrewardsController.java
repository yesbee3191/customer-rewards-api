package com.charter.customerrewards.controller;

import com.charter.customerrewards.domain.CustomerRewards;
import com.charter.customerrewards.entity.Customer;
import com.charter.customerrewards.repository.CustomerRepository;
import com.charter.customerrewards.service.CustomerrewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerrewardsController {

    @Autowired
    CustomerrewardsService customerrewardsService;

    @GetMapping("/customers")
    public List<CustomerRewards> getCustomerDetails(){
        System.out.println("Request Received");
       return customerrewardsService.customerService();
    }


}
