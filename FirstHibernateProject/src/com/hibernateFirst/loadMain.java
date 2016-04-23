package com.hibernateFirst;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;

public class loadMain {

	public static void main(String[] args) {
		
		//HUtil hUtil = new HUtil();

		Student student = new Student();
		student.setStudent_name("Sudeeksha1");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("9999988888");
		studentDetail.setStudent(student);
		
		student.setStudentDetail(studentDetail);
	
		
		SessionFactory sessionFactory = HUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);

		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close(); 

	}

}
