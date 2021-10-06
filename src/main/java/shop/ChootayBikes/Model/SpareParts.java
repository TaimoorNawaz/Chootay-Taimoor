package shop.ChootayBikes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpareParts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float cost;
    private int partsAvailable;
    private boolean availabilityStatus;

    public SpareParts() {
    }

    public SpareParts(String name, float cost, int partsAvailable, boolean availabilityStatus) {
        this.name = name;
        this.cost = cost;
        this.partsAvailable = partsAvailable;
        this.availabilityStatus = availabilityStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getPartsAvailable() {
        return partsAvailable;
    }

    public void setPartsAvailable(int partsAvailable) {
        this.partsAvailable = partsAvailable;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
