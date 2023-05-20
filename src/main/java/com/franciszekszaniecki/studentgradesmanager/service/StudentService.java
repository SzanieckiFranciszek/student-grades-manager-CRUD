package com.franciszekszaniecki.studentgradesmanager.service;

import com.franciszekszaniecki.studentgradesmanager.exception.StudentNotFoundException;
import com.franciszekszaniecki.studentgradesmanager.model.Student;
import com.franciszekszaniecki.studentgradesmanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.findStudentById(studentId).orElseThrow(() -> new StudentNotFoundException("Student by id: " + studentId + " wasn't found in data base."));
    }
        public Student saveStudent(Student student){

            //To Do Add business logic before saving Student
            //Add diagram to Git
            return studentRepository.save(student);
        }

        public List<Student> getAllStudent() {
            return studentRepository.findAll();
        }

        public Student updatedStudent(Student student){
            return  studentRepository.save(student);
        }
        public void removeStudentById(Long studentId){
            studentRepository.removeStudentById(studentId);
        }
    }
