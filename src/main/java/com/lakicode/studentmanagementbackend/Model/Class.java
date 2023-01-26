package com.lakicode.studentmanagementbackend.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Table(name = "class")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "instructor")
    private String instructor;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "CLASS_STUDENT_TABLE",
            joinColumns = {
                    @JoinColumn(name = "class_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            }
    )
    @JsonManagedReference
    private Set<Student> students;

}
