package com.skildistillery.cart.data;

public class Product {

	private long upc;
	private double price;
	private String name;

	public Product(long upc, double price, String name) {
		super();
		this.upc = upc;
		this.price = price;
		this.name = name;
	}

	public Product() {

	}

	public long getUpc() {
		return upc;
	}

	public void setUpc(long upc) {
		this.upc = upc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [upc=" + upc + ", price=" + price + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (upc ^ (upc >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (upc != other.upc)
			return false;
		return true;
	}

}
