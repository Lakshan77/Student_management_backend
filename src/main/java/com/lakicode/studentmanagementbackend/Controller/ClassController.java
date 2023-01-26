package com.lakicode.studentmanagementbackend.Controller;

import com.lakicode.studentmanagementbackend.Model.Class;
import com.lakicode.studentmanagementbackend.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class ClassController {

    @Autowired
    private ClassRepository classRepository;

    public ClassController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    //Create Class endpoint
    @PostMapping("/class")
    public Class createClass(@RequestBody Class classe){
        return classRepository.save(classe);
    }

    //Get all Class details endpoint
    @GetMapping("/class")
    public List<Class> getAllClasses(){
        return classRepository.findAll();
    }

}
