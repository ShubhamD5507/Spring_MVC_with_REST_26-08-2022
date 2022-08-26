package com.demo.prowing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.prowing.model.Student;
import com.demo.prowing.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student std) {
		
		return studentRepository.addStudent(std);
	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepository.getAllStudent();
	}

}
