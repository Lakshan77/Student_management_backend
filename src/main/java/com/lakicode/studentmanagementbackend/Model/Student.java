package com.lakicode.studentmanagementbackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "grade")
    private String grade;

//    @ManyToMany(mappedBy = "students", fetch = FetchType.LAZY)
//    @JsonBackReference
//    private Set<Class> classes;


}
