package OneToMany.OneToMany.Repository;

import OneToMany.OneToMany.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
 //   @Query("select e from #{#entityName} e where e.isDeleted = true")
   // @Transactional(readOnly = true);
   // default findInactive: Nothing;
}
