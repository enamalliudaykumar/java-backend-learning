package com.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.HibernetDBConnec.DBConnection;

public class NativeQuery {

	// Native will be used to use the normal SQL query language insted of the
	// hibernate language
	// in this we need to use the date base nameing not hibernate jave clas naming
	public static void main(String[] args) {

		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();

		openSession.beginTransaction();

		
		SelectionQuery<Employee> createSelectionQuery1 = openSession
				.createNativeQuery("SELECT *  FROM HIBER_EMPLOYEE  WHERE ID = 4", Employee.class);
		List<Employee> list1 = createSelectionQuery1.list();
		System.out.println("Normal select query Result with where condition id " + list1);

		MutationQuery NativecreateMutationQuery = openSession.createNativeMutationQuery(
				"INSERT INTO HIBER_EMPLOYEE (EMPLOYEE_NAME,EMPLOYEE_ID,SALARY)VALUES(?1,?2,?3)");

		NativecreateMutationQuery.setParameter(1, "Aniruddha");
		NativecreateMutationQuery.setParameter(2, 1814);
		NativecreateMutationQuery.setParameter(3, 200000);
		System.out.println("DML mutation query " + NativecreateMutationQuery);
		NativecreateMutationQuery.executeUpdate();
		openSession.getTransaction().commit();

	}
}
