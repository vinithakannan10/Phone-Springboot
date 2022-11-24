package com.Socialmedia.Activity.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "social_media")
    public class SocialDAO {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)

        private int id;

        @Column(name = "name")
        private String name;

        @Column(name = "status")
        private String status;

        @Column(name = "contact_num")
        private int contactNum;

    }

