package com.phantastic.core.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String ssn;
}
