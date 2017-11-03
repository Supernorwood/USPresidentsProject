package com.skildistillery.cart.data;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> cart = new ArrayList<>();
	
	public List<Product> getItems() {
		return new ArrayList<>(cart);
	}
	
	public boolean add(Product p) {
		return cart.add(p);
	}
	
	public double getTotalPrice() {
		double total = 0.0;
		for (Product product : cart) {
			total += product.getPrice();
		}
		return total;
	}
	
	public void emptyCart() {
		cart = new ArrayList<>();
	}
}