package com.office.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registration")
public class OfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "phone")
    private String phone;

    @Column (name = "email")
    private String email;

    @Column (name = "address_line1")
    private String addressLine1;

    @Column (name = "address_line2")
    private String addressLine2;

    @Column (name = "city")
    private String city;

    @Column (name = "state")
    private String state;

    @Column (name = "country")
    private String country;

    @Column (name = "status")
    private String status;

}
