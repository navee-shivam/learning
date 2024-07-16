package com.spring.jdbc.demo.dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.demo.mapper.StudentMapper;
import com.spring.jdbc.demo.model.Student;

@Repository
@Qualifier("studentDao")
public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_PERSON = "INSERT INTO student.student_table "
			+ "(student_name, student_class, student_interest, student_marks) "
			+ "VALUES (?,?,?,?) ";

	private final String SQL_FETCH_ALL = "SELECT * FROM student_table ";

	private final String SQL_UPDATE = "UPDATE student_table SET student_marks = ? ";

	private final String SQL_DELETE = " DELETE from student_table ";

	private final String SQL_BY_ID = " where student_id = ? ";

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean insertData(Student student) {
		return jdbcTemplate.update(SQL_INSERT_PERSON, student.getStudentName(),
				student.getStudentClass(), student.getStudentInterest(),
				student.getStudentMarks()) > 0;
	}

	public boolean updateData(Student student, int studentId) {
		return jdbcTemplate.update(SQL_UPDATE + SQL_BY_ID,
				student.getStudentMarks(), studentId) > 0;
	}

	public boolean deleteData(int studentId) {
		return jdbcTemplate.update(SQL_DELETE + SQL_BY_ID, studentId) > 0;
	}

	public Student fetchData(int studentId) {
		return jdbcTemplate.queryForObject(SQL_FETCH_ALL + SQL_BY_ID,
				new Object[] { studentId }, new StudentMapper());
	}

	public List<Student> getAll() {
		return jdbcTemplate.query(SQL_FETCH_ALL, new StudentMapper());
	}
}
