package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.HibernetDBConnec.DBConnection;

import org.hibernate.query.SelectionQuery;

public class DMLOperations {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		/*
		Students st1 = new Students(10,"Uday","SEA");
		openSession.persist(st1); // persists means used in the Insert queries to the table 
		openSession.getTransaction().commit();
		//select query syntax  DQL Operation
				//Select * from Students where id =1;  ///* for select query we are not using the 
		/*begin trancstion and commit tranction becuse its not a trancstion its just a select 
		query where we will be seeing the data for modifing the data we need the begin the transction and commit*/
		/*Students find = openSession.find(Students.class, 3);
		System.out.println("Select : "+ find);*/
		
		
		// Select Query 
		
		openSession.beginTransaction();
		
		Students find = openSession.find(Students.class, 10);
		System.out.println("Select : "+ find);
		//
		
		// Delete 
		/*openSession.beginTransaction();
		Students delst1 = new Students(2,"","");
		openSession.remove(delst1);
		openSession.getTransaction().commit();*/
		//
		
		
		//Update 
		/*
		 * While we doing the update we need to do the select and then we need to do the 
		 * update the only the updated column will be update or else the whole row will be updated
		 */
		/*openSession.beginTransaction();
		Students find2 = openSession.find(Students.class, 3);
		find2.setDep("AP2");
		openSession.merge(find2);
		openSession.getTransaction().commit();*/
		//
		
		
		
	}
}
