package com.office.Repository;

import com.office.Entity.OfficeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<OfficeEntity,Integer> {
}
