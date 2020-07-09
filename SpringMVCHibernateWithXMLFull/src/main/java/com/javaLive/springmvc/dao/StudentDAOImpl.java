package com.javaLive.springmvc.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaLive.springmvc.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveStudentObj(Student studentObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(studentObj);
	}

	public List<Student> getAllStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		List<Student> theQuery = currentSession.createQuery("from Student").list();
		return theQuery;
	}

	public Student getStudentObj(int theId) {
		Student studentObj = (Student) sessionFactory.getCurrentSession().get(Student.class, theId);
		return studentObj;
	}

	public void removeStudentObj(int theId) {
		Student studentObj = (Student) sessionFactory.getCurrentSession().get(Student.class, theId);
		sessionFactory.getCurrentSession().delete(studentObj);
	}

}