package com.kiranacademy.hasaex;

public class Order {

	int oid ,quantity;
	String itemName;
	
	public Order(int oid, int quantity, String itemName) {
		super();
		this.oid = oid;
		this.quantity = quantity;
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", quantity=" + quantity + ", itemName=" + itemName + "]";
	}
	
	
	
}
