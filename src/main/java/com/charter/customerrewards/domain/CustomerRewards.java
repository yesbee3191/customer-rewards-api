package com.charter.customerrewards.domain;

import java.util.List;

public class CustomerRewards {

    private String customerName;
    private List<Long> transactions;
    private List<Long> monthlyRewards;
    private long totalRewards;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Long> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Long> transactions) {
        this.transactions = transactions;
    }

    public List<Long> getMonthlyRewards() {
        return monthlyRewards;
    }

    public void setMonthlyRewards(List<Long> monthlyRewards) {
        this.monthlyRewards = monthlyRewards;
    }

    public long getTotalRewards() {
        return totalRewards;
    }

    public void setTotalRewards(long totalRewards) {
        this.totalRewards = totalRewards;
    }

    @Override
    public String toString() {
        return "CustomerRewards{" +
                "customerName='" + customerName + '\'' +
                ", transactions=" + transactions +
                ", monthlyRewards=" + monthlyRewards +
                ", totalRewards=" + totalRewards +
                '}';
    }
}
