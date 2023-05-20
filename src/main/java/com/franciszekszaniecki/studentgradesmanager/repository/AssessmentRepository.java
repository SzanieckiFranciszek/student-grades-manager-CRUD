package com.franciszekszaniecki.studentgradesmanager.repository;

import com.franciszekszaniecki.studentgradesmanager.model.Assessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssessmentRepository extends JpaRepository<Assessment,Long> {
    Optional<Assessment> findAssessmentStudentById(Long assessmentStudentId);

    void removeAssessmentStudentById(Long assessmentStudentId);
}
