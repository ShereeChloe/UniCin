package sample.Controllers;

import sample.Customer;
import sample.Data.CustomerData;

import java.util.ArrayList;

/**
 * Created by u1257802 on 11/03/2019.
 */
public class CustomerController {

    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerController(){
        CustomerData cd = new CustomerData();
        customers = cd.getCustomerData();
    }

    public Customer checkLoginDetails(String username, String password){
        for(Customer customer : customers){
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CustomerController{" +
                "customers=" + customers +
                '}';
    }

}
