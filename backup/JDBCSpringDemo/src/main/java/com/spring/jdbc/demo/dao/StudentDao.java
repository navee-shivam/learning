package com.spring.jdbc.demo.dao;

import java.util.List;

import com.spring.jdbc.demo.model.Student;

public interface StudentDao {

	public abstract boolean insertData(Student student);

	public abstract Student fetchData(int studentId);

	public abstract boolean updateData(Student student, int studentId);

	public abstract boolean deleteData(int studentId);

	public abstract List<Student> getAll();
}
