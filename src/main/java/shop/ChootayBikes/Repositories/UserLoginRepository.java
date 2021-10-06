package shop.ChootayBikes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.ChootayBikes.Model.UserLogin;

import java.util.Optional;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,Integer> {
    Optional<UserLogin> findByUserName(String userName);
}
