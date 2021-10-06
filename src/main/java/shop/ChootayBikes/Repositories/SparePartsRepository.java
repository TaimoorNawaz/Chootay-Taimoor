package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.SpareParts;

public interface SparePartsRepository extends JpaRepository<SpareParts, Integer> {
}
