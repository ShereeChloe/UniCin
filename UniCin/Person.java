/**
 * Created by u1257802 on 07/03/2019.
 */
public class Person {

    private String name;
    private int age;
    private String emailAddress;

    public Person(){

    }

    public Person(String name, int age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
