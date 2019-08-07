package com.autoboxing;

import javafx.util.converter.CurrencyStringConverter;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customers> customer;

    public Branch(String name) {
        this.name = name;
        customer = new ArrayList<Customers>();
    }
    public boolean newCustomer(String cusName, double initialTransaction){
        if(findCustomer(cusName)==null){
            this.customer.add(new Customers(cusName, initialTransaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String cusName, double amount){
        Customers existingCustomer = findCustomer(cusName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }

    private Customers findCustomer(String cusName){

        for(int i = 0; i<this.customer.size(); i++){
            Customers obj = customer.get(i);
            if(obj.getName().equals(cusName)){
                return obj;
            }
        }
        return null;
    }
}
