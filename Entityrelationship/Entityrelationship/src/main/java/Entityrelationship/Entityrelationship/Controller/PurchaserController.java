package Entityrelationship.Entityrelationship.Controller;


import Entityrelationship.Entityrelationship.Entity.Dressess;
import Entityrelationship.Entityrelationship.Entity.Purchaser;
import Entityrelationship.Entityrelationship.Service.PurchaserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchaserController {
    @Autowired
    private PurchaserService purchaserService;

    @PostMapping("/savePost")
    private String savePost(@RequestBody Purchaser purchaser){
      purchaserService.save(purchaser);
        return "success post";
    }
    @PutMapping("/update")
    private String update(@RequestBody Purchaser purchaser){
        purchaserService.update(purchaser);
        return "updated";
    }
    @GetMapping("/getAll")
    private List<Purchaser> getAll() {
        return purchaserService.getAll();
    }

//    @GetMapping("/get/{id}")
//    private Optional<Purchaser> getById(@PathVariable("id")Integer id){
//        Optional<Purchaser>obj=purchaserService.getById(id);
//        return obj;
//    }

    @GetMapping("/get/{id}")
    private Optional<Purchaser> getById(@PathVariable("id")Integer id){
        return purchaserService.getById(id);
    }
    }

