package com.franciszekszaniecki.studentgradesmanager.repository;

import com.franciszekszaniecki.studentgradesmanager.model.ProjectStudent;
import com.franciszekszaniecki.studentgradesmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectStudentRepository extends JpaRepository<ProjectStudent,Long> {
    Optional<ProjectStudent> findProjectStudentById(Long projectStudentId);

    void removeProjectStudentById(Long projectStudentId);
}
