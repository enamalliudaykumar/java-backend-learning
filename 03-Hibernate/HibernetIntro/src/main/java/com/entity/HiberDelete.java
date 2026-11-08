package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class HiberDelete {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();

		openSession.beginTransaction();
		int idnum = 10;
		Students students = new Students(idnum);
		openSession.remove(students);

		System.out.println("Data is deleted for the ID "+idnum );
		openSession.getTransaction().commit();
		openSession.close();
		
	}

}
