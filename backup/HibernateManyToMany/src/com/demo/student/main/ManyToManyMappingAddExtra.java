package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Course;
import com.demo.jdbc.model.Student;

public class ManyToManyMappingAddExtra {

	public static void main(String[] args) {

		// create session factory
		final SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		final Session session = factory.openSession();

		try {
			System.out.println("creating Many to Many mapping ");

			session.beginTransaction();

			// create a course
			int studentId = 101;
			System.out.println("\n Fetch student id 101 \n");
			Student fetch = session.get(Student.class, studentId);

			// save the course
			System.out.println("create the course");
			Course tempCourse = new Course(502, "Python learn");
			Course tempCourse2 = new Course(503, "Game develop learn");

			System.out.println("Add student to course");
			tempCourse.addStudent(fetch);
			tempCourse2.addStudent(fetch);

			System.out.println("save course");

			session.save(tempCourse);
			session.save(tempCourse2);

			session.getTransaction().commit();

			System.out.println("inserted");

		} finally {
			session.close();
			factory.close();
		}

	}

}
