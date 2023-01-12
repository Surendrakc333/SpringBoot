package com.nt.project;

import java.util.List;

public interface AppService {
    public StudentEntity addStudent(StudentEntity student);
    public List<StudentEntity> getAllStudents();
}
