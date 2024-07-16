package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Course;
import com.demo.jdbc.model.Student;

public class ManyToManyMappingDelete {

	public static void main(String[] args) {

		// create session factory
		final SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		final Session session = factory.openSession();

		/**
		 * Delete the one of the courses so only the relationship will broke
		 */
		try {
			System.out.println("creating Many to Many mapping ");

			session.beginTransaction();

			// get the course
			int courseId = 501;
			Course tempCourse = session.get(Course.class, courseId);

			// delete the course
			System.out.println("deleting the course : " + tempCourse);
			session.delete(tempCourse);

			session.getTransaction().commit();

			System.out.println("inserted");

		} finally {
			session.close();
			factory.close();
		}

	}

}
