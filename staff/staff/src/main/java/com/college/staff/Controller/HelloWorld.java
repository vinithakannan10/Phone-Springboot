package com.college.staff.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/save")
        public String hello() {
            return "Hello world";
        }
    }

