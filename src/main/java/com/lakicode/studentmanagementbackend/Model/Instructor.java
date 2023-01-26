package com.lakicode.studentmanagementbackend.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Instructor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instructor {

    @Id
    private long id;

    @Column(name = "name")
    private String name;

}
