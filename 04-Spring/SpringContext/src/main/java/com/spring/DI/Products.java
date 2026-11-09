package com.spring.DI;

public class Products {

	
	private int productid;
	private int price;
	private String productName;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", price=" + price + ", productName=" + productName + "]";
	}
}
