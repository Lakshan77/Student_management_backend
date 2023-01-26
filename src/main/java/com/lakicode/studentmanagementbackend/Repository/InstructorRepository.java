package com.lakicode.studentmanagementbackend.Repository;

import com.lakicode.studentmanagementbackend.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
