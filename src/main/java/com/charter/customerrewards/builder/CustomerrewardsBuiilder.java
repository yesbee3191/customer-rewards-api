package com.charter.customerrewards.builder;

import com.charter.customerrewards.domain.CustomerRewards;
import com.charter.customerrewards.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
public class CustomerrewardsBuiilder {

    public List<CustomerRewards> customerInfoBuild(List<Customer> customers, Set<String> cusNames){



        return null;
    }

    public CustomerRewards customerInfoBuildHelper(List<Customer> customers){
        System.out.println("1");
        return null;
    }
}
