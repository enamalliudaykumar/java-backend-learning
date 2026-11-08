package com.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.entity.HibernetDBConnec.DBConnection;

public class HiberEmployeCode {

	public static void main(String[] args) {

		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();

		openSession.beginTransaction();
		
		
		
		Employee employee = new Employee("Krishna Kanth", 102342, 200000); 
		
		  openSession.persist(employee);

		// SELECT

		// WITH CLASS
		int id = 4;
		Employee select = openSession.find(Employee.class, id);
		System.out.println("Selct quey result" + select);
		System.out.println("Selct for id " + id);
		
		
		// WITH OUT CLASS USING SELECT QUERY 
		System.out.println("Normal select query Result Start");
		// We cant write the normal select in the hibernate we need to use the syntax of Hibernate language
		//like the table should have a alise name no * in the place of the * we need to giev the alise name
		SelectionQuery<Employee> createSelectionQuery = openSession.createSelectionQuery("SELECT E FROM Employee E",Employee.class);
		List<Employee> list = createSelectionQuery.list();
		System.out.println("Normal select query Result"+ list);
		
		
		// With where conditon
		SelectionQuery<Employee> createSelectionQuery1 = openSession.createSelectionQuery("SELECT E FROM Employee E WHERE ID = 4",Employee.class);
		List<Employee> list1 = createSelectionQuery1.list();
		System.out.println("Normal select query Result with where condition id "+ list1);
		
		// With where condtion we need to pass the dynamic values 
		int dynid = 6;
		SelectionQuery<Employee> createSelectionQuery2 = openSession.createSelectionQuery("SELECT E FROM Employee E WHERE ID = ?1",Employee.class);
		createSelectionQuery2.setParameter(1, dynid);
		List<Employee> list2 = createSelectionQuery2.list();
		System.out.println("Normal select query Result with Dynamic where condition id "+ list2);
		
		
		// END
		
		
		//Data Manipulation Language
		
		
		
		
		/*
		 * INSERT -- Add new records 
		 * UPDATE -- Modify existing records 
		 * DELETE -- Remove
		 * 
		 * 
		 * 
		 */
		
		MutationQuery createMutationQuery = openSession.createMutationQuery("INSERT INTO Employee (employeName,employee_id,salary)VALUES(?1,?2,?3)");
		
		createMutationQuery.setParameter(1, "Harish S");
		createMutationQuery.setParameter(2, 814);
		createMutationQuery.setParameter(3, 200000);
		System.out.println("DML mutation query "+ createMutationQuery);
		createMutationQuery.executeUpdate();
		openSession.getTransaction().commit();
		
		//ENDDDDD
		
		
		
	
		

		//INSERT
		/*
		 * employee employee = new employee("Uday Kumar", 0310, 60000); employee
		 * employee1 = new employee("Ganesh S", 0211, 60000); employee employee2 = new
		 * employee("Shan", 0723, 100000); openSession.persist(employee1);
		 * openSession.persist(employee); openSession.persist(employee2);
		 * 
		 * System.out.println("Data is inserted into the table");
		 * 
		 * 
		 * //
		 */

		// If we need dont need to class mapping insert we can do the normal select
		// query concept

		// END

		
		openSession.close();

	}
}
