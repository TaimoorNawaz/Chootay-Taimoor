package shop.ChootayBikes.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Mechanic")
public class Mechanic extends UserPerson {

    private int salary;
    private String dateHired;
    private String userId;

    public Mechanic() {
    }

    public Mechanic(String firstName, String lastName, String phone, String email, String dateHired, String userId, UserLogin userLogin) {
        super(firstName, lastName, phone, email,userLogin);
        this.dateHired = dateHired;
        this.userId = userId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
