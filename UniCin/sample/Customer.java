package sample;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class Customer extends Person{

    private Customer cust;
    private int customerID;
    private String temporaryCustomerID;
    private boolean loyaltyMember;
    private boolean joinLoyaltyScheme;
    private int loyaltyPointsNumber;
    private String password;
    private String username;
    //private static int nextUniqueId = 0;


    public Customer(String firstName, String lastName, LocalDateTime dob, String emailAddress, int customerID,
                    String temporaryCustomerID, boolean loyaltyMember, boolean joinLoyaltyScheme,
                    int loyaltyPointsNumber, String password, String username) {
        super(firstName, lastName, dob, emailAddress);
        this.customerID = customerID;
        this.temporaryCustomerID = temporaryCustomerID;
        this.loyaltyMember = loyaltyMember;
        this.joinLoyaltyScheme = joinLoyaltyScheme;
        this.loyaltyPointsNumber = loyaltyPointsNumber;
        this.password = password;
        this.username = username;
    }

    public int getCustomerID() {
        return customerID;
    }

    //void setCu

    public String getTemporaryCustomerID() {
        return temporaryCustomerID;
    }

    public boolean isLoyaltyMember() {
        return loyaltyMember;
    }

    public boolean isJoinLoyaltyScheme() {
        return joinLoyaltyScheme;
    }

    public int getLoyaltyPointsNumber() {
        return loyaltyPointsNumber;
    }

    public String getPassword(){return password; }

    public String getUsername(){return username; }

}
