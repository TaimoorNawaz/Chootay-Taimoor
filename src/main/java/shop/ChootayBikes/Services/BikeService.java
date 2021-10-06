package shop.ChootayBikes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.ChootayBikes.Model.Bike;
import shop.ChootayBikes.Repositories.BikesRepository;
import java.util.List;

@Service
public class BikeService {

    @Autowired
    public BikesRepository bikesRepository;

    public List<Bike> getAllBikes()
    {
  //      List<Bike> bikes = new ArrayList<>();
 //       bikesRepository.findAll().forEach(bikes::add);
        return bikesRepository.findAll();
    }
    public void addBike(Bike bike)
    {
        bikesRepository.save(bike);
    }
    public void updateBike(int id,Bike bike){
        bikesRepository.save(bike);
    }

    public void deleteBike(int id){
        bikesRepository.deleteById(id);
    }
}
