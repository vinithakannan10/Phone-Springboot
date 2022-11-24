package com.office.Controller;

import com.office.Entity.OfficeEntity;
import com.office.Repository.OfficeRepository;
import com.office.Service.OfficeService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OfficeController {
    @Autowired
    private OfficeService officeService;


    @PostMapping("/savePost")
    private String savePost(@RequestBody OfficeEntity officeEntity){
        officeService.save(officeEntity);
        return"created successfully";
    }

    @PutMapping("/updatePut")
    private String updatePut(@RequestBody OfficeEntity officeEntity){
        officeService.save(officeEntity);
        return "success";
    }

    @GetMapping("/get/{registrationId}")
    private Optional<OfficeEntity> getById(@PathVariable("registrationId")Integer id){
        return officeService.getById(id);
    }

    @GetMapping("/getAll")
    private List<OfficeEntity> getAll(){

        return officeService.getAll();
    }

    @DeleteMapping("/delete/{registrationId}")
    private String deleteById(@PathVariable("registrationId")Integer id){

        return officeService.deleteById(id);
    }
}






