package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Bill;
import shop.ChootayBikes.Model.Customer;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
