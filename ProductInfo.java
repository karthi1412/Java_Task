package sample;

import java.util.List;

public class ProductInfo {
	
	int id;
	String products;
	int price;
	
//	Specification specification;
	
	List<Specification> specification;
	
	public ProductInfo(int id, String products, int price, List<Specification> specification) {
		super();
		this.id = id;
		this.products = products;
		this.price = price;
		
		this.specification = specification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	


	public List<Specification> getSpecification() {
		return specification;
	}

	public void setSpecification(List<Specification> specification) {
		this.specification = specification;
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", products=" + products + ", price=" + price + ", specification="
				+ specification + "]";
	}

	

	
	
	
	

}
