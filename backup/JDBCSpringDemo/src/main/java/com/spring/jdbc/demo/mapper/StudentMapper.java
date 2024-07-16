package com.spring.jdbc.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.demo.model.Student;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStudentId(rs.getInt("student_id"));
		student.setStudentName(rs.getString("student_name"));
		student.setStudentClass(rs.getInt("student_class"));
		student.setStudentInterest(rs.getString("student_interest"));
		student.setStudentMarks(rs.getInt("student_marks"));
		return student;
	}

}
