package com.hkmu.wadd.onlinecourse.models;

import jakarta.persistence.*;

@Entity
public class LectureFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String filePath;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    // === Getters and Setters ===

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}