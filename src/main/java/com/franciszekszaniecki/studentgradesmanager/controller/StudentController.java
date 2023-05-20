package com.franciszekszaniecki.studentgradesmanager.controller;

import com.franciszekszaniecki.studentgradesmanager.model.Student;
import com.franciszekszaniecki.studentgradesmanager.repository.StudentRepository;
import com.franciszekszaniecki.studentgradesmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService,
                             StudentRepository studentRepository) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId){
        return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addUser(@RequestBody Student student) {
        //return only User Id, no object User
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudentById(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.updatedStudent(student), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeStudentById(@PathVariable("id") Long studentId) {
        studentService.removeStudentById(studentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
