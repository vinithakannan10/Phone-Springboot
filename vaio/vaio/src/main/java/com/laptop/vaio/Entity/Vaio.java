package com.laptop.vaio.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "laptop")

    public class Vaio {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        @Column(name = "id")
        private int id;

        @Column(name = "lap_name")
        private String lapName;

        @Column(name = "price")
        private int price;

        @Column(name = "quality")
        private String quality;

        @Column(name = "quantity")
        private int quantity;





    }

