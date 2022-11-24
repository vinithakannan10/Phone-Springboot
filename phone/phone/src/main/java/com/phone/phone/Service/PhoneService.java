package com.phone.phone.Service;

import com.phone.phone.DTO.PhoneDTO;
import com.phone.phone.Entity.Phone;
import com.phone.phone.Repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    public String save(List<PhoneDTO> phoneDTO) {
        List<PhoneDTO> obj = new ArrayList<PhoneDTO>();
        Phone phone1;
        for (PhoneDTO i : phoneDTO) {
            phone1 = new Phone();
            phone1.setPrice(i.getPrice());
            phone1.setQuality(i.getQuality());
            phone1.setQuantity(i.getQuantity());
            phone1.setPhoneName(i.getPhoneName());
            phone1.setCreatedBy("vinitha");
            phone1.setCreatedOn(new Date());
            phone1.setId(i.getId());

            phoneRepository.saveAndFlush(phone1);

        }
        return "created successfully";
    }

    public String update(List<PhoneDTO> phoneDTO) {
        List<PhoneDTO> obj = new ArrayList<PhoneDTO>();
        Phone phone1;
        for (PhoneDTO i : phoneDTO) {
            //  if(i.getId()>0){
            phone1 = new Phone();
            //   }
            phone1.setPrice(i.getPrice());
            phone1.setQuality(i.getQuality());
            phone1.setQuantity(i.getQuantity());
            phone1.setPhoneName(i.getPhoneName());
            phone1.setId(i.getId());
            phoneRepository.saveAndFlush(phone1);
        }
        return " created successfully";
    }

    public List<Phone> getAll() {
        return phoneRepository.findAll();

    }

    public Optional<Phone> getById(Integer id) {

        return phoneRepository.findById(id);
    }

    public String deleteById(Integer id) {
        phoneRepository.deleteById(id);
        return "deleted successfully";
    }


    // queries

    //getBy
   // public Optional<Phone> findByPhoneName(String phoneName) {
  //    return   phoneRepository.findByPhoneName(phoneName);
   // }

    //getBy
    public Optional<Phone>findByPrice(Integer price){
        return phoneRepository.findByPrice(price);
    }
    //getAll
//    public List<Phone>findAll(){
//        return phoneRepository.findAll();
//    }

    //deleteBy

    public String deleteByid(Integer id){
        phoneRepository.deleteById(id);
        return "deleted";
}

// new queries

//    public List<Phone>findAll(String phoneName) {
//        return phoneRepository.findAll(phoneName);
//    }

    public List<Phone>finaAll(String phoneName){
        return phoneRepository.findAll(phoneName);
    }
}
