package OneToMany.OneToMany.Repository;


import OneToMany.OneToMany.Entity.RawMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawMaterialRepository extends JpaRepository<RawMaterial,Integer> {
}
