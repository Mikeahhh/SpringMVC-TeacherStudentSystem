package com.hkmu.wadd.onlinecourse.model;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    @ElementCollection
    private Map<String, Integer> options = new HashMap<>();

    // Getters and Setters
}