package sample;

import java.util.ArrayList;
import java.util.List;

public class ProductCreation {

	public static void main(String[] args) {
		ProductDetails pro1 = new ProductDetails();
		pro1.setId(1);
		pro1.setProductName("Book");
		pro1.setIsActive(true);
		
		ProductDetails pro2 = new ProductDetails();
		pro2.setId(1);
		pro2.setProductName("Book");
		pro2.setIsActive(false);
		
		System.out.println(pro1);
		System.out.println(pro2);
		
		Specification specfication = new Specification(4,64);
		Specification specfication2 = new Specification(6,128);
		
		List<Specification> specifications = new ArrayList<Specification>();
		specifications.add(specfication);
		specifications.add(specfication2);
		
		ProductInfo info = new ProductInfo(1,"Mobiles",20000,specifications);
		System.out.println(info);
		System.out.println(info.getProducts());
		
		
//		ProductInfo info = new ProductInfo(1,"Mobile",20000,specfication);
//		System.out.println(info);

	}

}
