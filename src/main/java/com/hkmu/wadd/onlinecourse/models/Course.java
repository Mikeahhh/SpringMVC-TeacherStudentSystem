package com.hkmu.wadd.onlinecourse.model;

import com.hkmu.wadd.onlinecourse.model.Material;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Material> materials;

    // Getters and Setters
}