package com.dinesh.web.model;

public class Product {


	private int ProductID;
	private String Name;
	private String Model;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", Name=" + Name + ", Model=" + Model + "]";
	}
}
