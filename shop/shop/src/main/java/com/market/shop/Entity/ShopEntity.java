package com.market.shop.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Shop")

public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ Column(name = "id")
    private int id;

    @ Column(name = "productName")
    private String productName;

    @ Column(name = "price")
    private int price;

    @ Column(name = "quantity")
    private int quantity;

    @ Column(name = "quality")
    private String quality;

}
