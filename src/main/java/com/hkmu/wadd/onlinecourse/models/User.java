package com.hkmu.wadd.onlinecourse.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String fullName;
    private String email;
    private String phoneNumber;

    private String role; // TEACHER 或 STUDENT

    // Getters and Setters
}