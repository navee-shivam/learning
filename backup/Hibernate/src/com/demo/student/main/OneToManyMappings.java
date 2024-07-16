package com.demo.student.main;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.jdbc.model.Instructor;
import com.demo.jdbc.model.InstructorDetail;

public class OneToManyMappings {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			System.out.println("creating one to one mapping ");

			// Object creation
			// InstructorDetail instructorDetail = new
			// InstructorDetail("m.google.com",
			// "read");
			// Instructor instruct = new Instructor("Kumar");

			int deleteId = 3;

			// set the instructor detail value
			// instruct.setInstructorDetail(instructorDetail);

			session.beginTransaction();

			InstructorDetail instruct = session.get(InstructorDetail.class, deleteId);

			System.out.println("found instructor : " + instruct.getInstructor());

			// session.save(instruct);
			// if (Objects.nonNull(instruct))
			// session.delete(instruct);

			session.getTransaction().commit();

			System.out.println("inserted");

		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} finally {
			factory.close();
		}

	}

}
