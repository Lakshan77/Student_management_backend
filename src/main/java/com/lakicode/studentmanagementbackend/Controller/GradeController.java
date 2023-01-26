package com.lakicode.studentmanagementbackend.Controller;

import com.lakicode.studentmanagementbackend.Model.Grade;
import com.lakicode.studentmanagementbackend.Repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    //Create Grade endpoint
    @PostMapping("/grade")
    public Grade createGrade(@RequestBody Grade grade){
        return gradeRepository.save(grade);
    }

    //Get all Grade details endpoint
    @GetMapping("/grades")
    public List<Grade> getAllGrade(){
        return gradeRepository.findAll();
    }
}
