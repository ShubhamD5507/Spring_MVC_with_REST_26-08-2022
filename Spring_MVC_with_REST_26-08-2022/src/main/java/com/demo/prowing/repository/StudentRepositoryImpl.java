package com.demo.prowing.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.prowing.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Student addStudent(Student std) {
	
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			
		Integer id = (Integer) session.save(std);
			
		Student saved = session.get(Student.class, id); 
		
			session.getTransaction().commit();
			session.close();
			
			return saved;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;			
		}
		
	}

	@Override
	public List<Student> getAllStudent() {
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Query<Student> query = session.createQuery("from Student");
			
			List<Student> students = query.list();
			
			session.getTransaction().commit();
			session.close();
			return students;
		}
		catch(Exception e) {
			
			e.printStackTrace();
			return null;	
		}
	}

}
