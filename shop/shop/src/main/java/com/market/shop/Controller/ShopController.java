package com.market.shop.Controller;

import com.market.shop.Entity.ShopEntity;
import com.market.shop.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping("/savePost")
        private String savePost(@RequestBody ShopEntity shopEntity){
        shopService.save(shopEntity);
        return"created successfully";
        }

        @PutMapping("/updatePut")
        private String updatePost(@RequestBody ShopEntity shopEntity){
        shopService.save(shopEntity);
        return "updated successfully";
    }
    @GetMapping("/get/{ShopId}")
    private Optional<ShopEntity>getById(@PathVariable("ShopId")Integer id)
    {
        return shopService.getById(id);
    }
    @GetMapping("/getAll")
    private List<ShopEntity>getAll(){

        return shopService.getAll();
    }
    @DeleteMapping("/delete/{ShopId}")
    private String deleteById(@PathVariable("ShopId")Integer id){

        return shopService.deletedById(id);
    }
    }

