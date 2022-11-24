package com.market.shop.Service;

import com.market.shop.Entity.ShopEntity;
import com.market.shop.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    public void save(ShopEntity shopEntity){
        shopRepository.saveAndFlush(shopEntity);

    }
    public String update(ShopEntity shopEntity){
        shopRepository.saveAndFlush(shopEntity);
        return"okay";
    }
    public Optional<ShopEntity> getById(Integer id){

        return shopRepository.findById(id);
    }
    public List<ShopEntity> getAll(){

        return shopRepository.findAll();
    }
    public String  deletedById(Integer id){
        shopRepository.deleteById(id);
        return "deleted successfully";
    }
}
