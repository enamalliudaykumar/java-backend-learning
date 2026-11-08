package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class HiberUpdate {
	public static void main(String[] args) {
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();

		openSession.beginTransaction();
		
		/*
		 * While we doing the update we need to do the select and then we need to do the 
		 * update the only the updated column will be update or else the whole row will be updated
		 */
		Students find2 = openSession.find(Students.class, 11);
		find2.setDep("AP2");
		openSession.merge(find2);
		openSession.getTransaction().commit();
		openSession.close();
	}
}
