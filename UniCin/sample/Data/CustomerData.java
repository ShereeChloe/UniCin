package sample.Data;

import sample.Customer;

import java.util.ArrayList;

public class CustomerData {

    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerData(){
    customers.add(new Customer("Sheree", "Edgar", null,
            "u1257802@unimail.hud.ac.uk", 001, null, true,
            false, 10, "12345", "ShereeChloe"));

    customers.add(new Customer("Jonathan", "Franklin", null,
            "u123456@unimal.hud.ac.uk", 002, null, false,
            false,0, "67891", "Jean"));
    }

    public ArrayList<Customer> getCustomerData() {
        return customers;
    }
}