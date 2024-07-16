package com.spring.jdbc.demo.model;

public class Student {
	private int studentId;
	private String studentName;
	private int studentClass;
	private String studentInterest;
	private int studentMarks;

	public Student() {

	}

	public Student(String studentName, int studentClass, String studentInterest,
			int studentMarks) {
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentInterest = studentInterest;
		this.studentMarks = studentMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentInterest() {
		return studentInterest;
	}

	public void setStudentInterest(String studentInterest) {
		this.studentInterest = studentInterest;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName
				+ ", studentClass=" + studentClass + ", studentInterest="
				+ studentInterest + ", studentMarks=" + studentMarks + "]";
	}

}
