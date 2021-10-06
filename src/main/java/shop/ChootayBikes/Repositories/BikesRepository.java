package shop.ChootayBikes.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.ChootayBikes.Model.Bike;

import java.util.List;
import java.util.Optional;


@Repository
public interface BikesRepository extends JpaRepository<Bike, Integer> {
}
