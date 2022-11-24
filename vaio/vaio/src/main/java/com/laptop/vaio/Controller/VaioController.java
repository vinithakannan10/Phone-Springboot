package com.laptop.vaio.Controller;

import com.laptop.vaio.DTO.VaioDTO;
import com.laptop.vaio.Entity.Vaio;
import com.laptop.vaio.Service.VaioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VaioController {
    @Autowired
    private VaioService vaioService;


    @PostMapping("/vaioPost")
    private String savePost(@RequestBody List<Vaio> vaio) {
        vaioService.save(vaio);
        return "success";
    }
    @PutMapping("/vaioUpdate")
    private String update(@RequestBody List<Vaio> vaio) {
        vaioService.update(vaio);
        return "created successfully";
    }

    @GetMapping("/getAll")
    private List <Vaio> getAll(){
        return  vaioService.getAll();
    }

    @GetMapping("/get/{vaioId}")
    private Optional<Vaio> getById(@PathVariable("vaioId")Integer id){
            return vaioService.getById(id);
    }
    @DeleteMapping("/delete/{vaioId}")
    private String deleteById(@PathVariable("vaioId")Integer id){
        vaioService.deleteById(id);
        return "deleted successfully";
    }

}
