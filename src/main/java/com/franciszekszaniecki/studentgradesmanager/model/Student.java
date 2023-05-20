package com.franciszekszaniecki.studentgradesmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long studentId;
    private String firstName;
    private String surName;
    private String email;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "coursesId")
    private Courses courses;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assessmentId")
    private AssessmentStudent assessment;
    private int activeStatus;
}
