package com.entity.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;

public class ManytoManyMapping {

	public static void main(String[] args) {

		SessionFactory sessionFactory = DBConnection.getSessionFactory();

		Session openSession = sessionFactory.openSession();

		//projectdetailSave(openSession);
		openSession.beginTransaction();
		
		EmployeeEntity employeeEntity = new EmployeeEntity("Uday Kumar","7993067914");
		EmployeeEntity employeeEntity2 = new EmployeeEntity("Uday Kumar","7993067914");
		
		
		openSession.find(ProjectEntity.class, 1);
		
		
		
		openSession.getTransaction().commit();
		openSession.close();

	}

	private static void projectdetailSave(Session openSession) {
		openSession.beginTransaction();

		ProjectEntity projectEntity = new ProjectEntity("ESAF PROJECT", 1);
		ProjectEntity projectEntity2 = new ProjectEntity("Canara Project", 2);
		ProjectEntity projectEntity3 = new ProjectEntity("CAGL GOLD LOAN", 2);

		openSession.persist(projectEntity);
		openSession.persist(projectEntity2);
		openSession.persist(projectEntity3);

		openSession.getTransaction().commit();
		openSession.close();
	}
}
