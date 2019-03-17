package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * Created by u1257802 on 07/03/2019.
 */
public class Person {

    private String firstName;
    private String lastName;
    private LocalDateTime dob;
    private String emailAddress;

    public Person(){

    }

    public Person(String firstName, String lastName, LocalDateTime dob, String emailAddress) {
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

    public LocalDateTime getDob() {
        return dob;
    }

    public String returnFormattedDate()
    {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        return format.format(dob);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
