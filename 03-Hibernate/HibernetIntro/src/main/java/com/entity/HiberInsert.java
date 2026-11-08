package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class HiberInsert {

	public static void main(String[] args) {

		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();

		openSession.beginTransaction();
		Students students = new Students(11,"Glady", "Captain");
		openSession.persist(students);

		System.out.println("Data is inserted into the table");
		openSession.getTransaction().commit();
		openSession.close();

	}

}
