package com.demo.prowing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.prowing.model.Student;
import com.demo.prowing.service.StudentService;


@RestController
public class MainController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	Student student;
	
	
	@PostMapping(value = "/student")
	public Student addStudent(@RequestBody Student std) {
		
		student = new Student();
		student.setStudentName(std.getStudentName());
		student.setStudentAddress(std.getStudentAddress());

		Student std1 = studentService.addStudent(student);
		
//		return new ResponseEntity<Student>(std1, HttpStatus.OK);
	
		return std1;
	}
	
	@GetMapping(value = "/students")
	public List<Student> getAllStudent() {
		
		List<Student> student = studentService.getAllStudent();
		
		return student;
	}
	
	
}
