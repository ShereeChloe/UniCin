/**
 * Created by u1257802 on 07/03/2019.
 */
public class Customer extends Person{

    private int customerID;
    private String temporaryCustomerID;
    private boolean loyaltyMember;
    private boolean joinLoyaltyScheme;
    private String loyaltyPointsNumber;
    //private static int nextUniqueId = 0;

    public Customer() {
    }

    public Customer(String name, int age, String emailAddress, int customerID,
                    boolean loyaltyMember) {
        super(name, age, emailAddress);
        this.customerID = customerID;
        this.loyaltyMember = loyaltyMember;
    }


    public Customer (int customerID, boolean loyaltyMember){

    }

    public Customer (String name, String temporaryCustomerID){

    }

    public int getCustomerID() {
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
