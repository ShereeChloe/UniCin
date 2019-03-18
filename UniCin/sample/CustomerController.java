package sample;

import java.util.ArrayList;

/**
 * Created by u1257802 on 11/03/2019.
 */
public class CustomerController {

    private ArrayList<Customer> customers = new ArrayList<>();

    public CustomerController(){
        //System.out.println(customers.size());

        CustomerData cd = new CustomerData();
        customers = cd.getCustomerData();
        //System.out.println(customers);
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
