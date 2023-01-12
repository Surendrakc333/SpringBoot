package com.nt.project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kidsData")
@CrossOrigin
public class Controller {
    @Autowired
    private AppService Application;

    @PostMapping("/plus")
    public String plus(@RequestBody StudentEntity kidsData) {
        Application.addStudent(kidsData);
        return "surendra singh shishodia best frnd is mohit 14dhary";
    }
    @GetMapping("/add")
    public List<StudentEntity> getAllStudentsList(){
     return Application.getAllStudents();
    }
}
