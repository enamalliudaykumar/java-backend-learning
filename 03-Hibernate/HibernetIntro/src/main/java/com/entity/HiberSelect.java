package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class HiberSelect {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		openSession.beginTransaction();
		
		Students find = openSession.find(Students.class, 10);
		
		
		System.out.println("Select Query Result "+ find);
		
		openSession.close();
		
		
	}

}
