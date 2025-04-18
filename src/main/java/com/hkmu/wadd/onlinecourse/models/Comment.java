package com.hkmu.wadd.onlinecourse.model;

import com.hkmu.wadd.onlinecourse.model.Course;
import com.hkmu.wadd.onlinecourse.model.Poll;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "lecture_id", nullable = true)
    private Course lecture;

    @ManyToOne
    @JoinColumn(name = "poll_id", nullable = true)
    private Poll poll;

    // Getters and Setters
}