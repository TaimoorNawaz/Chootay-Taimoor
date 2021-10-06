package shop.ChootayBikes.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends UserPerson {

    private int salary;
    private String managerType; // should be another class for it, just for now

    public Manager() {
    }

    public Manager(String firstName, String lastName, String phone, String email, UserLogin userLogin, int salary, String managerType) {
        super(firstName, lastName, phone, email, userLogin);
        this.salary = salary;
        this.managerType = managerType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }
}
