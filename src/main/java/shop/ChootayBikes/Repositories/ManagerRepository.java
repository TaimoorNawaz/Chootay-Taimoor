package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
}
