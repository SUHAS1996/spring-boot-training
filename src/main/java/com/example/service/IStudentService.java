package com.example.service;

import org.springframework.http.ResponseEntity;

import com.example.domain.Student;

public interface IStudentService {
	ResponseEntity createStudent(Student student);

}
