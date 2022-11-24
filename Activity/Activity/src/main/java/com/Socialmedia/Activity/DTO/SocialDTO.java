package com.Socialmedia.Activity.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class SocialDTO {

    private int id;
    private String name;
    private String status;
    private int contactNum;
}


