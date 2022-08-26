package com.demo.prowing.repository;

import java.util.List;

import com.demo.prowing.model.Student;

public interface StudentRepository {

	public Student addStudent(Student std);

	public List<Student> getAllStudent();

}
