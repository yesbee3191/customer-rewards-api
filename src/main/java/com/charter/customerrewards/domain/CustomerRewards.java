package com.charter.customerrewards.domain;

import java.util.List;

public class CustomerRewards {

    private String customerName;
    private List<Integer> transaction;
    private int monthlyRewards;
    private int totalRewards;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Integer> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Integer> transaction) {
        this.transaction = transaction;
    }

    public int getMonthlyRewards() {
        return monthlyRewards;
    }

    public void setMonthlyRewards(int monthlyRewards) {
        this.monthlyRewards = monthlyRewards;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }

    @Override
    public String toString() {
        return "CustomerRewards{" +
                "customerName='" + customerName + '\'' +
                ", transaction=" + transaction +
                ", monthlyRewards=" + monthlyRewards +
                ", totalRewards=" + totalRewards +
                '}';
    }
}
