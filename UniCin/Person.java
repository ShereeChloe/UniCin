/**
 * Created by u1257802 on 07/03/2019.
 */
public class Person {

    private String name;
    private String dob;
    private String emailAddress;

    public Person(){

    }

    public Person(String name, String dob, String emailAddress) {
        this.name = name;
        this.dob = dob;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
