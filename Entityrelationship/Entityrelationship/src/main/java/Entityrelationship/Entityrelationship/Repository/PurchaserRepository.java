package Entityrelationship.Entityrelationship.Repository;

import Entityrelationship.Entityrelationship.Entity.Purchaser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaserRepository extends JpaRepository<Purchaser,Integer> {

    //Optional<Purchaser> findById(Integer id);
}
