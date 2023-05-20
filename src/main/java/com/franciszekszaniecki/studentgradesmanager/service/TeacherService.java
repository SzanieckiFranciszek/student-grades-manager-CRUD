package com.franciszekszaniecki.studentgradesmanager.service;

import com.franciszekszaniecki.studentgradesmanager.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
}
