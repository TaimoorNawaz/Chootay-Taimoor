package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
