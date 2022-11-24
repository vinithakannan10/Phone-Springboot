package com.Relationship.relationship.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_table")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int  id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private int price;

//    @Column(name = "id")
//    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
}


