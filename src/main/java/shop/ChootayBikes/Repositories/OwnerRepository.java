package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
