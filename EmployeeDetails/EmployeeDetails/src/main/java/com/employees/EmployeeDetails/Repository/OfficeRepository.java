package com.employees.EmployeeDetails.Repository;

import com.employees.EmployeeDetails.Entity.Office;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRe{
    void saveAndFlush(Office office);
}
