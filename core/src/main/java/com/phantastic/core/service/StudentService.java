package com.phantastic.core.service;


import com.phantastic.core.model.Student;

import java.util.Optional;

public interface StudentService {
    Optional<Student> getStudentByFirstName(String firstName);
    Student createStudent(Student firstName);
}
