package com.skildistillery.cart.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAOMapImpl implements ProductDAO {
	
	private Map<Long,Product> inventory;
	
	public ProductDAOMapImpl() {
		inventory = new HashMap<>();
		loadInventory();
	}

	private void loadInventory() {
		Product p = new Product(123456, 1.99, "Banana");
		inventory.put(p.getUpc(), p);
		p = new Product(2345, 1.08, "Orange");
		inventory.put(p.getUpc(), p);
		p = new Product(23456, 1.01, "Avacado");
		inventory.put(p.getUpc(), p);
		p = new Product(23457, .98, "Spinach");
		inventory.put(p.getUpc(), p);
		p = new Product(23458, 1.28, "Honey");
		inventory.put(p.getUpc(), p);
		p = new Product(23459, 1.06, "Water");
		inventory.put(p.getUpc(), p);
		p = new Product(23545, 1.18, "Pizza");
		inventory.put(p.getUpc(), p);
		p = new Product(23645, 2.08, "Pear");
		inventory.put(p.getUpc(), p);
		
	}

	@Override
	public List<Product> getALLProducts() {
		return new ArrayList<Product> (inventory.values());
	}

	@Override
	public Product getProductByUPC(long upc) {
		return inventory.get(upc);
	}

}
