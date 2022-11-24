package com.clothes.dress.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clothes")
public class ClothesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "dress_id")
    private int dressId;

   @Column(name = "dress_name")
    private String dressName;

   @Column(name = "price")
    private int price;

   @Column(name = "quality")
    private String quality;

    @Column(name = "quantity")
    private int quantity;
}
