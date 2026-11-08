package com.entity.HibernetDBConnec.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.HibernetDBConnec.DBConnection;
import com.mysql.cj.result.RowList;

public class OneToManyorManyTOneMapping {

	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DBConnection.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		openSession.beginTransaction();
		
		OrderEntity orderEntity = new OrderEntity(2,500);
		OrderEntity orderEntity2 = new OrderEntity(3,5000);
		
		List<OrderEntity> firstuseroders = new ArrayList<OrderEntity>();
		List<OrderEntity> seconduseroders = new ArrayList<OrderEntity>();
		firstuseroders.add(orderEntity);
		seconduseroders.add(orderEntity2);
		
	UserEntity userEntity = new UserEntity("Üday", 88888,firstuseroders);
	UserEntity userEntity2 = new UserEntity("Shan", 7777,seconduseroders);
	
	orderEntity.setUsers(userEntity);
	orderEntity2.setUsers(userEntity2);
	
	openSession.persist(userEntity);
	
	openSession.persist(userEntity2);
	
	openSession.getTransaction().commit();
	openSession.close();
	
		
	}
}
