/**
 * Created by u1257802 on 07/03/2019.
 */
public class Customer {

    private String customerID;
    private String temporaryCustomerID;
    private boolean loyaltyMember;
    private boolean joinLoyaltyScheme;
    private String loyaltyPointsNumber;


    public Customer (String customerID, String loyaltyPointsNumber, boolean loyaltyMember){

    }

    public Customer (String customerID, boolean loyaltyMember){

    }

    public Customer (String temporaryCustomerID){

    }

    public String getCustomerID() {
        return customerID;
    }

    public String getTemporaryCustomerID() {
        return temporaryCustomerID;
    }

    public boolean isLoyaltyMember() {
        return loyaltyMember;
    }

    public boolean isJoinLoyaltyScheme() {
        return joinLoyaltyScheme;
    }

    public String getLoyaltyPointsNumber() {
        return loyaltyPointsNumber;
    }
}
