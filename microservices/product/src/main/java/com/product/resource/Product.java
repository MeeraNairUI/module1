package com.product.resource;

import java.math.BigDecimal;

public class Product{
//		private long product;
//		private String name;
//		private String description;
//		private BigDecimal price;
//		private int qty;
	
	
//		public long getProduct() {
//			return product;
//		}
//		public void setProduct(long product) {
//			this.product = product;
//		}
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getDescription() {
//			return description;
//		}
//		public void setDescription(String description) {
//			this.description = description;
//		}
//		public BigDecimal getPrice() {
//			return price;
//		}
//		public void setPrice(BigDecimal price) {
//			this.price = price;
//		}
//		public int getQty() {
//			return qty;
//		}
//		public void setQty(int qty) {
//			this.qty = qty;
//		}
//	}
	
	Integer product;
	String name;
	String category;
	String brand;
	 double Price ;
	public Integer getProduct() {
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public Product(Integer product, String name, String category, String brand, double price) {
		super();
		this.product = product;
		this.name = name;
		this.category = category;
		this.brand = brand;
		Price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
	
