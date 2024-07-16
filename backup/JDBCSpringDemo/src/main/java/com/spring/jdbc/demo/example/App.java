package com.spring.jdbc.demo.example;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.demo.config.AppConfig;
import com.spring.jdbc.demo.model.Student;
import com.spring.jdbc.demo.service.StudentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class);
		StudentService studentService = applicationContext.getBean("studentService",
				StudentService.class);

		insertData(studentService);
		// updateData(studentService);
		// deleteData(studentService);
		// fetchOne(studentService);
		// fetchData(studentService);
		applicationContext.close();
	}

	private static void fetchOne(StudentService studentService) {
		System.out.println(studentService.getData(1));
	}

	private static void deleteData(StudentService studentService) {
		System.out.println(studentService.deleteData(9));
	}

	private static void updateData(StudentService studentService) {
		Student student = new Student();
		student.setStudentMarks(80);
		System.out.println(studentService.updateData(student, 3));
	}

	private static void insertData(StudentService studentService) {
		Student student = new Student("Naveen", 5, "caroom", 22);
		System.out.println(studentService.addData(student));
	}

	private static void fetchData(StudentService studentService) {
		List<Student> studentLists = studentService.getAll();
		for (Student student : studentLists) {
			System.out.println(
					student.getStudentId() + " name : " + student.getStudentName()
							+ " - mark : " + student.getStudentMarks());
		}
	}
}
