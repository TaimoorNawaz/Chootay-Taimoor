package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ChootayBikes.Model.Customer;
import shop.ChootayBikes.Model.UserPerson;

public interface UserPersonRepository extends JpaRepository<UserPerson, Integer> {
}
