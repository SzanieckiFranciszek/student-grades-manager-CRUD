package com.franciszekszaniecki.studentgradesmanager.repository;

import com.franciszekszaniecki.studentgradesmanager.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Long> {
}
