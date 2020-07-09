package com.javaLive.springmvc.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaLive.springmvc.dao.StudentDAO;
import com.javaLive.springmvc.model.Student;
 
 
@Service
public class StudentServiceImpl implements StudentService {
 
	@Autowired
	StudentDAO studentDAO;
 
	@Transactional
	public void saveStudentObj(Student studentObj) {
		studentDAO.saveStudentObj(studentObj);
	}
 
	@Transactional
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}
 
	@Transactional
	public Student getStudentObj(int theId) {
		return studentDAO.getStudentObj(theId);
	}
 
	@Transactional
	public void removeStudentObj(int theId) {
		studentDAO.removeStudentObj(theId);
	}
 
}
