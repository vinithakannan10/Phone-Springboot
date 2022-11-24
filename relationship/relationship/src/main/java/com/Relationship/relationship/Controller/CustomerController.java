package com.Relationship.relationship.Controller;

import com.Relationship.relationship.Entity.Customer;

import com.Relationship.relationship.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    private String savePost(@RequestBody Customer customer){
        customerService.save(customer);
        return "success post";
    }
}
