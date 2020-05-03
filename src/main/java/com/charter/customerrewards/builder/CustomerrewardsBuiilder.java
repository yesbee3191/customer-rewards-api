package com.charter.customerrewards.builder;

import com.charter.customerrewards.domain.CustomerRewards;
import com.charter.customerrewards.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Service
public class CustomerrewardsBuiilder {
    static final List<CustomerRewards> customerRewardsFinalList = new ArrayList<>();

    public List<CustomerRewards> customerInfoBuild(List<Customer> customers, Set<String> cusNames) {
        customerRewardsFinalList.removeAll(customerRewardsFinalList);
        cusNames.forEach(cusName -> customerInfoBuildHelper(customers, cusName));
        return customerRewardsFinalList;
    }

    public void customerInfoBuildHelper(List<Customer> customers, String cusName) {

        List<Customer> customersList = customers.stream()
                .filter(customer -> customer.getName()
                        .equalsIgnoreCase(cusName))
                .collect(Collectors.toList());
        customerInfoBuildHelpertwo(customersList, cusName);
    }

    public void customerInfoBuildHelpertwo(List<Customer> customers, String cusName) {
        CustomerRewards customerRewards = new CustomerRewards();
        Optional<String> name = customers.stream().map(Customer::getName).findFirst();
        List<Long> transactions = customers.stream().map(Customer::getBill).collect(Collectors.toList());
        List<Customer> janTransactions = customers.stream().filter(customer -> customer.getMonth().equalsIgnoreCase("JAN")).collect(Collectors.toList());
        List<Customer> febTransactions = customers.stream().filter(customer -> customer.getMonth().equalsIgnoreCase("FEB")).collect(Collectors.toList());
        List<Customer> marTransactions = customers.stream().filter(customer -> customer.getMonth().equalsIgnoreCase("MAR")).collect(Collectors.toList());
        List<Long> monthlyRewards = customerInfoBuildHelperthree(janTransactions, febTransactions, marTransactions);
        long totalRewards = monthlyRewards.stream().mapToLong(a -> a).sum();
        customerRewards.setCustomerName(name.get());
        customerRewards.setTransactions(transactions);
        customerRewards.setMonthlyRewards(monthlyRewards);
        customerRewards.setTotalRewards(totalRewards);
        customerRewardsFinalList.add(customerRewards);

    }

    public List<Long> customerInfoBuildHelperthree(List<Customer> janTransactions, List<Customer> febTransactions, List<Customer> marTransactions) {
        Long janRewards = RewardsCalcuator(janTransactions.stream().mapToLong(Customer::getBill).sum());
        Long febRewards = febTransactions.stream().mapToLong(Customer::getBill).sum();
        Long marRewards = marTransactions.stream().mapToLong(Customer::getBill).sum();
        return Arrays.asList(janRewards, febRewards, marRewards);
    }

    public long RewardsCalcuator(Long transactions) {
        long rewards = 0;
        long remainingAmount = transactions;
        if (remainingAmount > 100) {
            rewards = (transactions - 100) * 2;
            remainingAmount = remainingAmount - (transactions - 100);
        }
        if (remainingAmount > 50) {
            rewards = rewards + (remainingAmount - 50);
        }
        return rewards;
    }
}
