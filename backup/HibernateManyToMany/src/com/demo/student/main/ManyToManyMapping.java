package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Course;
import com.demo.jdbc.model.Student;

public class ManyToManyMapping {

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
			Course addCourse = new Course(501, "Java Learn");

			// save the course
			System.out.println("Save the course");

			session.save(addCourse);

			// create student
			Student s1 = new Student(100, "Naveen", "naveen@gmail.com");
			Student s2 = new Student(101, "Dhosi", "dhosi@gmail.com");

			addCourse.addStudent(s1);
			addCourse.addStudent(s2);

			System.out.println("\nsaving the student");

			session.save(s1);
			session.save(s2);

			System.out.println("\n\n Saved students : " + addCourse.getStudents());

			session.getTransaction().commit();

			System.out.println("inserted");

		} finally {
			session.close();
			factory.close();
		}

	}

}
