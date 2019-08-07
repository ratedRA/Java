package com.autoboxing;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;
    private double initialTransaction;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    Customers(String name, double initialTransaction){
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }
    public void addTransaction(double amount){
        transactions.add(amount);
    }
}
