package com.franciszekszaniecki.studentgradesmanager.repository;

import com.franciszekszaniecki.studentgradesmanager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findStudentById(Long studentId);

    void removeStudentById(Long studentId);
}
