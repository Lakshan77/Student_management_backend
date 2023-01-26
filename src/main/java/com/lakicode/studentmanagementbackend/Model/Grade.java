package com.lakicode.studentmanagementbackend.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Grade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {

    @Id
    private long id;

    @Column(name = "grade")
    private String grade;

}
