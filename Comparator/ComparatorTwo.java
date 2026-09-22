package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class ComparatorTwo {
	
	int numbers;
	String products;
	int price;
	int rating;
	

	public ComparatorTwo(int numbers, String products, int price, int rating) {
		super();
		this.numbers = numbers;
		this.products = products;
		this.price = price;
		this.rating = rating;
	}
	

	@Override
	public String toString() {
		return "ComparatorTwo [numbers=" + numbers + ", products=" + products + ", price=" + price + ", rating=" + rating
				+ "]";
	}


	public static void main(String[] args) {
		
		ComparatorTwo practice = new ComparatorTwo(1, "Books", 200, 7);
		ComparatorTwo practice1 = new ComparatorTwo(2, "Pens", 50, 9);
		ComparatorTwo practice2 = new ComparatorTwo(3, "Notes", 100, 8);
		
		List<ComparatorTwo> prac= new ArrayList<>();
		
		prac.add(practice);
		prac.add(practice1);
		prac.add(practice2); 
		
		
		Comparator<ComparatorTwo> priceCom = new Comparator<ComparatorTwo>() {
			
			@Override
			public int compare(ComparatorTwo o1, ComparatorTwo o2) {
				return (o1.price - o2.price);
			}
		};
		
		Comparator<ComparatorTwo> ratingComparator = (a,b) -> a.rating - b.rating;
		
		 Collections.sort(prac,priceCom);
		 System.out.println(prac);
		 
		 Collections.sort(prac,ratingComparator);
		 System.out.println(prac);
		 
		 Collections.sort(prac,(a,b)-> b.rating - a.rating);
		 System.out.println(prac);
	}

}
