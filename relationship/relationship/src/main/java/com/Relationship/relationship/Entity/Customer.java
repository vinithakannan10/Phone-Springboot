package com.Relationship.relationship.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER,cascade = CascadeType.ALL)

    private List<Product> product;
}
