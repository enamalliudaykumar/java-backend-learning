package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class OneToOneMapping {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		
		Session openSession = sessionFactory.openSession();
		
		openSession.beginTransaction();
		
		
		//Inserted(openSession);
		
		OneToOneEntity find = openSession.find(OneToOneEntity.class, 1);
		System.out.println("find"+ find);
		
		OneToOneEntity2 find2 = openSession.find(OneToOneEntity2.class,1);
		System.out.println("find"+ find2);
		
		
		
	}


	private static void Inserted(Session openSession) {
		OneToOneEntity2 oneToOneEntity2 = new OneToOneEntity2("UDAY",29310531);
		
		OneToOneEntity oneToOneEntity = new OneToOneEntity("UDAY", 26, oneToOneEntity2);
		
		openSession.persist(oneToOneEntity);
		
		openSession.getTransaction().commit();
		
		openSession.close();
	}

}
