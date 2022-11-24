package com.employees.EmployeeDetails.Controller;


import com.employees.EmployeeDetails.Entity.Office;
import com.employees.EmployeeDetails.Service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficeController {

    @Autowired
    private OfficeService officeService;


    @PostMapping("/savePost")
    private String savePost(@RequestBody Office office){
        officeService.saveAndFlush(office);
        return"created successfully";
    }
}
