package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.PartsUsed;

public interface PartsUsedRepository extends JpaRepository<PartsUsed, Integer> {
}
