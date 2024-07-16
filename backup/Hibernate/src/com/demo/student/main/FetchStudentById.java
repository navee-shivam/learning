package com.demo.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Student;

public class FetchStudentById {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			System.out.println("fetch 5 student object ");

			session.beginTransaction();

			// fetch by ID
			Student studen = session.get(Student.class, 5);

			System.out.println(studen.toString());

			//update
			studen.setEmail("naveenkumar58957@gmail.com");

			//delete
			session.delete(studen);

			session.getTransaction().commit();

			System.out.println("updated or fetched");

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			factory.close();
		}
	}

}
