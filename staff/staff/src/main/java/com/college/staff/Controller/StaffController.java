package com.college.staff.Controller;

import com.college.staff.Entity.StaffEntity;
import com.college.staff.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("/saveStaff")
    private String saveStaff(@RequestBody StaffEntity staffEntity) {
        staffService.save(staffEntity);
        return "CreateSuccess";

    }

    @GetMapping("/get/{StaffId}")
    private Optional<StaffEntity> getById(@PathVariable("StaffId") Integer id) {
        return staffService.getById(id);
    }

    @GetMapping("/getAll")
    private List<StaffEntity> getAll() {
        return staffService.getAll();
    }

    @PutMapping("/update")
    private String update(@RequestBody StaffEntity staffEntity) {
        staffService.save(staffEntity);
        return "ok";
    }

    @DeleteMapping("/delete/{StaffId}")
    private String  deleteById(@PathVariable("StaffId") Integer id) {
        return staffService.deleteById(id);

    }
    @RequestMapping("/save")
    public class HelloWorld {
        public String hello() {
            return "Hello world";
        }
    }
}


