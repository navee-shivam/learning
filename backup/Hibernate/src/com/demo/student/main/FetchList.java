package com.demo.student.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Student;

public class FetchList {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			System.out.println("Fetch all student object ");

			session.beginTransaction();

			List<Student> studentList = new ArrayList<Student>();
			//HQL
			studentList = session.createQuery("from Student").list();
			displayStudents(studentList);
			doRemoveList(studentList);

			studentList = session.createQuery(" from Student where lastName like 'M%'").list();
			System.out.println("Fetch last  name M starts");
			displayStudents(studentList);
			doRemoveList(studentList);

			studentList = session.createQuery(" from Student where lastName like 'M%' OR lastName like 'Kumar'").list();
			System.out.println("Fetch last name kumar or M");
			displayStudents(studentList);
			doRemoveList(studentList);

			session.getTransaction().commit();

			System.out.println("fetched.....");

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			factory.close();
		}
	}

	private static void doRemoveList(List<Student> studentList) {
		studentList.removeAll(studentList);
	}

	private static void displayStudents(List<Student> studentList) {
		studentList.stream().forEach(System.out::println);
	}

}
