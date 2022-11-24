package com.clothes.dress.Service;

import com.clothes.dress.Entity.ClothesEntity;
import com.clothes.dress.Repository.ClothesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClothesService {
    @Autowired
    private ClothesRepository clothesRepository;

   public String save(List<ClothesEntity> clothesEntity){

   // List<ClothesEntity> obj=new ArrayList<ClothesEntity>();
    ClothesEntity clothes;
    for(ClothesEntity i:clothesEntity) {
        clothes = new ClothesEntity();
     //   clothes.setPrice(i.getPrice());

        clothesRepository.saveAndFlush(i);
    }
    return "success";

}

    public List<ClothesEntity> getAll()
    {
       return clothesRepository.findAll();
    }
}

