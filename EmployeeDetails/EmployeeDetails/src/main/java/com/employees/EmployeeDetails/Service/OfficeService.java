package com.employees.EmployeeDetails.Service;

import com.employees.EmployeeDetails.Entity.Office;
import com.employees.EmployeeDetails.Repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public String save(Office office){
        officeRepository.saveAndFlush(office);
        return "created successfully";
    }
}
