package com.autoboxing;

public class Main {
    public static void main(String []args){
        Bank bank = new Bank("SBI");
        bank.addBranch("Bellandur");
        bank.addCustomer("Bellandur", "John", 10.0);
        bank.addCustomer("Bellandur", "slayer", 20.0);
        bank.addCustomer("Bellandur", "lender", 20.0);
        bank.addCustomerTransaction("Marathahalli","John", 20.0);
        bank.addCustomerTransaction("Bellandur","John", 20.0);

        bank.addBranch("Marathahalli");
        bank.addCustomer("Marathahalli", "sandy", 5.0);
        bank.listCustomers("Bellandur", true);

        bank.addBranch("other");
        if(!bank.addCustomer("other", "rather", 20.0));
        if(!bank.addBranch("Marathahalli")){
            System.out.println("Branch already exists");
        }
    }
}
