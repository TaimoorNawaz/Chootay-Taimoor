package shop.ChootayBikes.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends UserPerson {

    private int memberNumber;
    private boolean memberStatus;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String phone, String email, int memberNumber, boolean memberStatus, UserLogin userLogin) {
        super(firstName, lastName, phone, email, userLogin);
        this.memberNumber = memberNumber;
        this.memberStatus = memberStatus;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public boolean isMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(boolean memberStatus) {
        this.memberStatus = memberStatus;
    }
}
