package com.clothes.dress.Repository;

import com.clothes.dress.Entity.ClothesEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothesRepository extends JpaRepository<ClothesEntity,Integer> {
}
