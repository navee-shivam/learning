package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			System.out.println("creating 3 student object ");
			// insert
			Student student = new Student("Dummy", "siva", "k@yahoo.com");
			Student student1 = new Student("Dumagolli", "muruga", "mr@hotmail.com");

			session.beginTransaction();

			session.save(student);
			session.save(student1);

			session.getTransaction().commit();

			System.out.println("inserted");

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			factory.close();
		}
	}
}
