package com.demo.prowing.service;

import java.util.List;

import com.demo.prowing.model.Student;

public interface StudentService {

	public Student addStudent(Student std);
	
	public List<Student> getAllStudent();
}
