package shop.ChootayBikes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String make;
    private String modelName;
    private Long cost;
    private Long price;
    private int inventoryCount;

    public Bike() {
    }

    public Bike(String make, String modelName, Long cost, Long price, int inventoryCount) {
        this.make = make;
        this.modelName = modelName;
        this.cost = cost;
        this.price = price;
        this.inventoryCount = inventoryCount;
    }

    @Override
    public String toString(){
        return "Bike [id=" + id + ",make" + make + ",modelName" + modelName + ",cost"+cost+",price" + price + ",inventoryCount" + inventoryCount + "]";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }
}
