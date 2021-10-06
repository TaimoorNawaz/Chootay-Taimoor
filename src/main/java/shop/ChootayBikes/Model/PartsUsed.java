package shop.ChootayBikes.Model;

import javax.persistence.*;

@Entity
public class PartsUsed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "spare_parts_id")
    private SpareParts spareParts;
    @ManyToOne
    @JoinColumn(name = "repairs_id")
    private Repairs repairs;

    public PartsUsed() {
    }

    public PartsUsed(SpareParts spareParts, Repairs repairs) {
        this.spareParts = spareParts;
        this.repairs = repairs;
    }

    public Repairs getRepairs() {
        return repairs;
    }

    public SpareParts getSpareParts() {
        return spareParts;
    }
}
