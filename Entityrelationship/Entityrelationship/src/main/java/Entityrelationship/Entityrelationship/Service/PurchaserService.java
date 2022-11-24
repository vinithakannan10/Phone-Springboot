package Entityrelationship.Entityrelationship.Service;

import Entityrelationship.Entityrelationship.Entity.Dressess;
import Entityrelationship.Entityrelationship.Entity.Purchaser;
import Entityrelationship.Entityrelationship.Repository.DressessRepository;
import Entityrelationship.Entityrelationship.Repository.PurchaserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaserService {
    @Autowired
    private PurchaserRepository purchaserRepository;
    @Autowired
    private DressessRepository dressessRepository;

    public String save(Purchaser purchaser) {
        purchaser = purchaserRepository.save(purchaser);
        for (Dressess obj : purchaser.getDressess()) {
            obj.setPurchaser(purchaser);
            dressessRepository.saveAndFlush(obj);
        }
        return "success";
    }

    public String update(Purchaser purchaser) {
        purchaser = purchaserRepository.save(purchaser);
        for (Dressess i : purchaser.getDressess()) {
            i.setPurchaser(purchaser);
            dressessRepository.saveAndFlush(i);
        }
        return "updated";
    }

    public List<Purchaser> getAll() {
        return purchaserRepository.findAll();
    }

    //  public Purchaser getById(Integer id) {
    //  Optional<Purchaser> obj =  purchaserRepository.findById(id);
    //  Purchaser obj1=obj.get();
    //  return obj1;
    //  }


    //public Optional<Purchaser> getById(Integer id) {
    //  Optional<Purchaser> obj = purchaserRepository.findById(id);
    // return obj;
    //}

    public Optional<Purchaser> getById(Integer id) {
        return purchaserRepository.findById(id);
    }
}
