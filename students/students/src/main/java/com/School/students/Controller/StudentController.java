package com.School.students.Controller;

import com.School.students.Entity.StudentsDAO;
import com.School.students.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get")
    public String getName()
    {
        return "hello world";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/post")
    public void addStudent(@RequestBody StudentsDAO studentsDAO){

        studentService.saveStudent(studentsDAO);
    }

}
