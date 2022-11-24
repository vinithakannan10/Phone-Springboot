package com.Socialmedia.Activity.Controller;

import com.Socialmedia.Activity.DTO.SocialDTO;
import com.Socialmedia.Activity.Entity.SocialDAO;
import com.Socialmedia.Activity.Service.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SocialController {
    @Autowired
    private SocialService socialService;

    @GetMapping("/findAll")
    private List<SocialDAO> getAllActivity(){
        return socialService.getAll();
    }
}
