package com.Relationship.relationship.Service;

import com.Relationship.relationship.Entity.Customer;
import com.Relationship.relationship.Entity.Product;
import com.Relationship.relationship.Repository.CustomerRepository;
import com.Relationship.relationship.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;
    public String save(Customer customer) {
         customer= customerRepository.save(customer);
         for (Product obj:customer.getProduct()){
             obj.setCustomer(customer);
             productRepository.saveAndFlush(obj);
         }

        return "success";
    }
}
