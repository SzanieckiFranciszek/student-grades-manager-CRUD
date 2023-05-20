package com.franciszekszaniecki.studentgradesmanager.service;

import com.franciszekszaniecki.studentgradesmanager.exception.CourseNotFoundException;
import com.franciszekszaniecki.studentgradesmanager.exception.StudentNotFoundException;
import com.franciszekszaniecki.studentgradesmanager.model.Course;
import com.franciszekszaniecki.studentgradesmanager.model.Student;
import com.franciszekszaniecki.studentgradesmanager.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    public Course getCourseById(Long courseId) {
        return courseRepository.findCourseById(courseId).orElseThrow(() -> new CourseNotFoundException("Course by id: " + courseId + " wasn't found in data base."));
    }
    public Course saveCourse(Course course){

        //To Do Add business logic before saving Student
        //Add diagram to Git
        return courseRepository.save(course);
    }

    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }
}
