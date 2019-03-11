/**
 * Created by u1257802 on 07/03/2019.
 */
public class Customer extends Person{

    private int customerID;
    private String temporaryCustomerID;
    private boolean loyaltyMember;
    private boolean joinLoyaltyScheme;
    private int loyaltyPointsNumber;
    //private static int nextUniqueId = 0;


    public Customer(String name, String dob, String emailAddress, int customerID, String temporaryCustomerID,
                    boolean loyaltyMember, boolean joinLoyaltyScheme, int loyaltyPointsNumber) {
        super(name, dob, emailAddress);
        this.customerID = customerID;
        this.temporaryCustomerID = temporaryCustomerID;
        this.loyaltyMember = loyaltyMember;
        this.joinLoyaltyScheme = joinLoyaltyScheme;
        this.loyaltyPointsNumber = loyaltyPointsNumber;
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

    public int getLoyaltyPointsNumber() {
        return loyaltyPointsNumber;
    }

}
