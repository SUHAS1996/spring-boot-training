package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Student;
import com.example.service.IStudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	@PostMapping("/create-student")
	public ResponseEntity welcomeController(@RequestBody Student studentInfo){
		try {
			return studentService.createStudent(studentInfo);
		}catch (Exception e) {
			return new ResponseEntity("failed",HttpStatus.EXPECTATION_FAILED);
		}
		
	}
}
