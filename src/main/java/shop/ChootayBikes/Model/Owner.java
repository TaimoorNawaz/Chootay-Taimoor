package shop.ChootayBikes.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Owner")
public class Owner extends UserPerson {

    private String ntn;

    public Owner() {
    }

    public Owner(String firstName, String lastName, String phone, String email, String ntn, UserLogin userLogin) {
        super(firstName, lastName, phone, email, userLogin);
        this.ntn = ntn;
    }

    public String getNtn() {
        return ntn;
    }

    public void setNtn(String ntn) {
        this.ntn = ntn;
    }
}
