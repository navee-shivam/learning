package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Course;
import com.demo.jdbc.model.Student;

public class ManyToManyMappingFetch {

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
			System.out.println("\n Fetch Student");
			System.out.println(fetch.toString());
			System.out.println("\n\n Fetch course LAZYLOAD \n");
			System.out.println(fetch.getCouses());

			session.getTransaction().commit();

			System.out.println("inserted");

		} finally {
			session.close();
			factory.close();
		}

	}

}
