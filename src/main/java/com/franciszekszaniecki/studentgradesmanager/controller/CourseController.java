package com.franciszekszaniecki.studentgradesmanager.controller;

import com.franciszekszaniecki.studentgradesmanager.model.Course;
import com.franciszekszaniecki.studentgradesmanager.model.Student;
import com.franciszekszaniecki.studentgradesmanager.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/course")
public class CourseController {

    private CourseService courseService;

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long courseId){
        return new ResponseEntity<>(courseService.getCourseById(courseId), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(courseService.getAllCourse(),HttpStatus.OK);
    }
}
