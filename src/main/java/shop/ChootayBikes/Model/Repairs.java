package shop.ChootayBikes.Model;

import javax.persistence.*;

@Entity
public class Repairs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "mechanic_user_id")
    private Mechanic mechanic;
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "customer_user_id")
    private Customer customer;
    private String description;

    public Repairs() {
    }

    public Repairs(Mechanic mechanic, String description) {
        this.mechanic = mechanic;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bill getBill() {
        return bill;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

}
