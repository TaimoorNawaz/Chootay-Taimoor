package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.Mechanic;

public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {
}
