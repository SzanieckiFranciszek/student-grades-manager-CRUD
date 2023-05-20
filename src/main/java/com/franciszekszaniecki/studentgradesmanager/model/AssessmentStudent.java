package com.franciszekszaniecki.studentgradesmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AssessmentStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "coursesId")
    private Courses courses;
}
