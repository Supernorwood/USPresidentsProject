package com.skildistillery.cart.data;

import java.util.List;

public interface ProductDAO {
	List<Product> getALLProducts();
	//add product
	Product getProductByUPC(long upc);
	

}
