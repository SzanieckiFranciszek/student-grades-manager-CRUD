package com.franciszekszaniecki.studentgradesmanager.repository;

import com.franciszekszaniecki.studentgradesmanager.model.AssessmentStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentStudentRepository extends JpaRepository<AssessmentStudent,Long> {
}
