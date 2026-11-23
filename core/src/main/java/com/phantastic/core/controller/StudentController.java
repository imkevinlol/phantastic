package com.phantastic.core.controller;

import com.phantastic.core.model.Student;
import com.phantastic.core.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RestControllerAdvice
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/firstname/{firstname}")
    public ResponseEntity<Student> getStudentByFirstName(@PathVariable String firstname) {
        return studentService.getStudentByFirstName(firstname)
                .map(value -> ok().body(value)).orElseGet(() -> notFound().build());
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student newStudent) {
        return ok().body(studentService.createStudent(newStudent));
    }
}
