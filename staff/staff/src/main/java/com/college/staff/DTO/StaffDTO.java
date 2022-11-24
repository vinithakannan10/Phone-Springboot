package com.college.staff.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO {
    private int id;
    private String name;
    private int age;
    private int salary;
}
