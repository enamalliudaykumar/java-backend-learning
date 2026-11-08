package com.entity.HibernetDBConnec;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Students;
import com.entity.HibernetDBConnec.OneToMany.OneToManyorManyTOneMapping;
import com.entity.HibernetDBConnec.OneToMany.OrderEntity;
import com.entity.HibernetDBConnec.OneToMany.UserEntity;
import com.entity.ManyToMany.EmployeeEntity;
import com.entity.ManyToMany.ProjectEntity;
import com.entity.Employee;
import com.entity.OneToOneEntity;
import com.entity.OneToOneEntity2;
import com.entity.OneToOneMapping;

public class DBConnection {

	public static SessionFactory SessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (SessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(OneToOneEntity.class);
			cfg.addAnnotatedClass(OneToOneEntity2.class);
			//cfg.addAnnotatedClass(Employee.class);
			cfg.addAnnotatedClass(OrderEntity.class);
			cfg.addAnnotatedClass(UserEntity.class);
			cfg.addAnnotatedClass(ProjectEntity.class);
			cfg.addAnnotatedClass(EmployeeEntity.class);
			SessionFactory = cfg.buildSessionFactory();
			return SessionFactory;
		} else {
			return SessionFactory;
		}

	}
}
