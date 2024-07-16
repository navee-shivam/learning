package com.hibernate.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.Model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNumber(1);
		student.setName("Naveen");
		student.setSex("Male");

		Configuration configuration = new Configuration();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.save(student);
	}
}
