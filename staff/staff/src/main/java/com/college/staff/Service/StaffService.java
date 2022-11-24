package com.college.staff.Service;

import com.college.staff.Entity.StaffEntity;
import com.college.staff.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    private StaffRepository staffRepository;

    public String save(StaffEntity staffEntity) {
        staffRepository.saveAndFlush(staffEntity);
        return "success";
    }

    public Optional<StaffEntity> getById(Integer id) {
        return staffRepository.findById(id);
    }

    public List<StaffEntity> getAll() {
        return staffRepository.findAll();
    }

    public String update(StaffEntity staffEntity) {
        staffRepository.saveAndFlush(staffEntity);
        return "ok";
    }
    public String deleteById(Integer id) {
        staffRepository.deleteById(id);
        return "Deleted successfully";
    }
}


