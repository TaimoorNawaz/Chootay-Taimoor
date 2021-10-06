package shop.ChootayBikes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.ChootayBikes.Model.SpareParts;
import shop.ChootayBikes.Repositories.SparePartsRepository;

import java.util.List;

@Service
public class SparePartService {

    @Autowired
    public SparePartsRepository sparePartsRepository;

    public List<SpareParts> getAllSpareParts() {
        return sparePartsRepository.findAll();
    }

    public void addSparePart(SpareParts sparePartsa) {
        sparePartsRepository.save(sparePartsa);
    }

    public void updateSparePart(int id, SpareParts sparePartsa) {
        sparePartsRepository.save(sparePartsa);
    }

    public void deleteSparePart(int id) {
        sparePartsRepository.deleteById(id);

    }
}
