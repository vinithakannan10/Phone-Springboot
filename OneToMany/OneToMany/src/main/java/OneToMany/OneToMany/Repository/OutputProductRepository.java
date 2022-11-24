package OneToMany.OneToMany.Repository;

import OneToMany.OneToMany.Entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
