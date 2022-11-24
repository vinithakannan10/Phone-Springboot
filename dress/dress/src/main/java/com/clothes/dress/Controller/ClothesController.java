package com.clothes.dress.Controller;

import com.clothes.dress.Entity.ClothesEntity;
import com.clothes.dress.Service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClothesController {
    @Autowired
    private ClothesService clothesService;

    @PostMapping("/create")
    private String savePost(@RequestBody List<ClothesEntity> clothesEntity){
        clothesService.save(clothesEntity);
        return "success post";
    }
    @GetMapping("/getAll")
    private List<ClothesEntity> getAll(){

        return clothesService.getAll();
    }

}
