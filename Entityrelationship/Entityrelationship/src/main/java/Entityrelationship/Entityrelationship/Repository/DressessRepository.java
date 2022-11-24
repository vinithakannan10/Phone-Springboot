package Entityrelationship.Entityrelationship.Repository;

import Entityrelationship.Entityrelationship.Entity.Dressess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DressessRepository extends JpaRepository<Dressess,Integer> {

}
