package com.neu.beans;

public class ShoppingItem {
	
	static int cnt=0;
	public ShoppingItem(){
		
	}
	/**Attributes **/
	private String productId;
	
	private String name;
	private String type;
	private String description;
	private String price;

	/**Getters/Setters **/
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}
