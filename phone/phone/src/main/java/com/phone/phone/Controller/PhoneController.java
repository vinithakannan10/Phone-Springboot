package com.phone.phone.Controller;

import com.phone.phone.DTO.PhoneDTO;
import com.phone.phone.Entity.Phone;
import com.phone.phone.Service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @PostMapping("/phonePost")
    private String savePost(@RequestBody List<PhoneDTO> phoneDTO) {
        phoneService.save(phoneDTO);
        return "created successfully";

    }

    @PutMapping("/phoneUpdate")
    private String update(@RequestBody List<PhoneDTO> phoneDTO) {
        phoneService.update(phoneDTO);
        return "created successfully";

    }
//
//    @GetMapping("/getAll")
//    private List<Phone> getAll() {
//
//        return phoneService.getAll();
//    }

    @GetMapping("/get/{phoneId}")
    private Optional<Phone> getById(@PathVariable("phoneId") Integer id) {

        return phoneService.getById(id);
    }

   // @DeleteMapping("/delete/{id}")
  //  private String deleteById(@PathVariable("id") Integer id) {
      //  phoneService.deleteById(id);
        //return "deleted successfully";
   // }


    // queries

//    @GetMapping("/getname/{phoneName}")
//    private Optional<Phone> findById(@PathVariable("phoneName") String phoneName) {
//        return phoneService.findByPhoneName(phoneName);
//    }

//    @GetMapping("/getPrice/{price}")
//    private Optional<Phone> findById(@PathVariable("price") Integer price) {
//        return phoneService.findByPrice(price);
//    }
//
//    @GetMapping("/getAllPrice")
//    private List<Phone> findAll() {
//        return phoneService.findAll();
//    }

    @DeleteMapping("/deleteId/{id}")
    private String deleteById(@PathVariable("id") Integer id) {
        return  phoneService.deleteById(id);
}

// new queries

//@GetMapping("/get")
//private List<Phone>findAll(@RequestParam(defaultValue="")String phoneName) {
//    return phoneService.findAll(phoneName);
//}
    @GetMapping("/getAll")
    private List<Phone>findAll(@RequestParam(defaultValue="")String phoneName){
        return phoneService.finaAll(phoneName);
    }
}



