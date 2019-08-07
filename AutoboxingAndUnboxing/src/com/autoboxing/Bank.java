package com.autoboxing;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String bName) {
        if (findBranch(bName) == null) {
            this.branch.add(new Branch(bName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String cusName, double initialTransaction) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.newCustomer(cusName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String cusName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return existingBranch.addCustomerTransaction(cusName, amount);
        }
        return false;
    }

    private Branch findBranch(String bName) {
        for (int i = 0; i < this.branch.size(); i++) {
            Branch obj = this.branch.get(i);
            if (obj.getName().equals(bName)) {
                return obj;
            }
        }
        return null;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customers> branchCustomer = branch.getCustomer();
            for (int i = 0; i < branchCustomer.size(); i++) {
                Customers customer = branchCustomer.get(i);
                System.out.println("Name of the customer is " + customer.getName());
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> allTransactions = customer.getTransactions();
                    for (int j = 0; j < allTransactions.size(); j++) {
                        System.out.println(allTransactions.get(j));
                    }
                } else {
                    System.out.println("No transactions to show");
                }
            }
        }
    }
}

