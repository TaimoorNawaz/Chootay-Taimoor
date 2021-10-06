package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
