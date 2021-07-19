package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.domain.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public ResponseEntity createStudent(Student student) {
		Student studentInfo =null;
		if(student.getId()!=null) {
		 studentInfo = studentRepository.saveAndFlush(student);
		 		return new ResponseEntity("DetailsUpdated successfully",HttpStatus.OK);
		}else {
			studentInfo = studentRepository.saveAndFlush(student);
	 		return new ResponseEntity("userCreated successfully",HttpStatus.OK);
		}
		
		
	}

}
