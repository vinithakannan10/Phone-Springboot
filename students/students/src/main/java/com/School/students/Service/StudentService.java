package com.School.students.Service;

import Repository.StudentRepository;
import com.School.students.Entity.StudentsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

//    @Autowired(required = true)
    private StudentRepository studentRepository;

    public void saveStudent(StudentsDAO studentsDAO){
        studentRepository.save(studentsDAO);
    }
}
