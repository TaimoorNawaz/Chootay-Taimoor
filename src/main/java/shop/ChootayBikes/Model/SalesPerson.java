package shop.ChootayBikes.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("SalesPerson")
public class SalesPerson extends UserPerson {

    private float percentage;
    private String dateHired;
    private int salary;

    public SalesPerson() {
    }

    public SalesPerson(String firstName, String lastName, String phone, String email, float percentage, String dateHired, int salary, UserLogin userLogin) {
        super(firstName, lastName, phone, email,userLogin);
        this.percentage = percentage;
        this.dateHired = dateHired;
        this.salary = salary;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
