package shop.ChootayBikes.Model;

import javax.persistence.*;

@Entity
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    @JoinColumn(name = "sales_person_user_id")
    private SalesPerson salesPerson;
    @OneToOne
    @JoinColumn(name = "bike_id")
    private Bike bike;
    private float discount;
    private float total;

    public Sales() {
    }

    public Sales(SalesPerson salesPerson, Bike bike, float discount, float total, String date) {
        this.salesPerson = salesPerson;
        this.bike = bike;
        this.discount = discount;
        this.total = total;
        this.date = date;
    }
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;

    public Bike getBike() {
        return bike;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

}
