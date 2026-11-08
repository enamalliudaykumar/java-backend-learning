package com.entity.HibernetDBConnec.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "USER_DETAILS")
@Entity
public class UserEntity {
	@Id
	@Column(name ="USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(unique = true ,name = "USER_NAME")
	private String username;
	public List<OrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
	public void setMobnumber(double mobnumber) {
		this.mobnumber = mobnumber;
	}
	@Column(name= "MOBILE_NUMBER")
	private double mobnumber ;
	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "users")	
	private List<OrderEntity> orders;
	
	
	public UserEntity() {
		super();
	}
	public UserEntity(String username, double mobnumber, List<OrderEntity> orders) {
		super();
		this.userid = userid;
		this.username = username;
		this.mobnumber = mobnumber;
		this.orders = orders;
	}
	public UserEntity( String username, double mobnumber) {
		super();
		this.userid = userid;
		this.username = username;
		this.mobnumber = mobnumber;
	}
	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", username=" + username + ", mobnumber=" + mobnumber + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getMobnumber() {
		return mobnumber;
	}
	public void setMobnumber(int mobnumber) {
		this.mobnumber = mobnumber;
	}
	
	
	
}
