package com.spring.jdbc.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.jdbc.demo.dao.StudentDao;
import com.spring.jdbc.demo.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public StudentServiceImpl(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public boolean addData(Student student) {
		return studentDao.insertData(student);
	}

	public Student getData(int studentId) {
		return studentDao.fetchData(studentId);
	}

	public boolean updateData(Student student, int studentId) {
		return studentDao.updateData(student, studentId);
	}

	public boolean deleteData(int studentId) {
		return studentDao.deleteData(studentId);
	}

	public List<Student> getAll() {
		return studentDao.getAll();
	}

}
