package com.spring.jdbc.demo.service;

import java.util.List;

import com.spring.jdbc.demo.model.Student;

public interface StudentService {

	public abstract boolean addData(Student student);

	public abstract Student getData(int studentId);

	public abstract boolean updateData(Student student, int studentId);

	public abstract boolean deleteData(int studentId);

	public abstract List<Student> getAll();

}
