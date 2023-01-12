package com.nt.project;

import com.nt.project.StudentEntity;
import com.nt.project.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services implements AppService{
    @Autowired
    private studentRepository studentrepository;

    @Override
    public StudentEntity addStudent(StudentEntity student){
        return studentrepository.save(student);
    }
    @Override
    public List<StudentEntity> getAllStudents(){
        return studentrepository.findAll();
    }
}
