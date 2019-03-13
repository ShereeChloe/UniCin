/**
 * Created by u1257802 on 11/03/2019.
 */
public class Administrator extends Person {

    private int adminId;
    private String payGrade;

    public Administrator(String name, String dob, String emailAddress, int adminId, String payGrade) {
        super(name, dob, emailAddress);
        this.adminId = adminId;
        this.payGrade = payGrade;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }
}
