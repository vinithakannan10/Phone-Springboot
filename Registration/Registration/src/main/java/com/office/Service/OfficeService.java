package com.office.Service;

import com.office.Entity.OfficeEntity;
import com.office.Repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {
    @Autowired
    private OfficeRepository officeRepository;

    public String save(OfficeEntity officeEntity){
        officeRepository.saveAndFlush(officeEntity);
        return "created successfully";
    }

    public String update (OfficeEntity officeEntity){
        officeRepository.saveAndFlush(officeEntity);
        return "success";
    }
    public Optional<OfficeEntity> getById(Integer id){

        return officeRepository.findById(id);
    }
    public List<OfficeEntity> getAll(){

        return officeRepository.findAll();
    }
    public String deleteById(Integer id){
         officeRepository.deleteById(id);
         return "deleted successfully";
    }
}



