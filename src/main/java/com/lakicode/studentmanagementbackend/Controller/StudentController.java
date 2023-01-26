package com.lakicode.studentmanagementbackend.Controller;

import com.lakicode.studentmanagementbackend.Model.Student;
import com.lakicode.studentmanagementbackend.Repository.ClassRepository;
import com.lakicode.studentmanagementbackend.Repository.StudentRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Create student endpoint
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    //Get all Student details endpoint
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //Get Student by ID endpoint
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exit with id: " +id));
        return ResponseEntity.ok(student);
    }

}
