package com.entity.HibernetDBConnec.OneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER_DETAILS")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private int order_id;

	@Column(name = "ORDER_QUANTITY")
	private int quantity;

	@Override
	public String toString() {
		return "OrderEntity [order_id=" + order_id + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Column(name = "ORDER_PRICE")
	private int price;
	@JoinColumn(name = "userid")
	@ManyToOne
	private UserEntity users;

	public UserEntity getUsers() {
		return users;
	}

	public void setUsers(UserEntity users) {
		this.users = users;
	}

	public OrderEntity() {

	}

	public OrderEntity( int quantity, int price) {
		super();
		this.order_id = order_id;
		this.quantity = quantity;
		this.price = price;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
