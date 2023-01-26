package com.lakicode.studentmanagementbackend.Controller;

import com.lakicode.studentmanagementbackend.Model.Instructor;
import com.lakicode.studentmanagementbackend.Model.Student;
import com.lakicode.studentmanagementbackend.Repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    //Create Instructor endpoint
    @PostMapping("/instructor")
    public Instructor createInstructor(@RequestBody Instructor instructor){
        return instructorRepository.save(instructor);
    }

    //Get all Instructors details endpoint
    @GetMapping("/instructors")
    public List<Instructor> getAllInstructor(){
        return instructorRepository.findAll();
    }

}
