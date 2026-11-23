package com.phantastic.core.service.impl;

import com.phantastic.core.model.Student;
import com.phantastic.core.repository.StudentRepository;
import com.phantastic.core.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static io.micrometer.common.util.StringUtils.isNotBlank;
import static org.springframework.util.StringUtils.capitalize;

@Service
public class StudentServiceImpl implements StudentService {

    final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Student> getStudentByFirstName(String firstName) {
        return repository.findByFirstName(capitalize(firstName));
    }

    @Override
    public Student createStudent(Student student) {
        if (isNotBlank(student.getFirstName()))
            student.setFirstName(capitalize(student.getFirstName()));
        if (isNotBlank(student.getLastName()))
            student.setLastName(capitalize(student.getLastName()));
        return repository.save(student);
    }
}
