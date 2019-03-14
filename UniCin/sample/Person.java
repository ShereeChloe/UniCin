package sample;

import java.util.Date;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class Person {

    private String firstName;
    private String lastName;
    private Date dob;
    private String emailAddress;

    public Person(){

    }

    public Person(String firstName, String lastName, Date dob, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
