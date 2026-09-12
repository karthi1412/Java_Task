package sample;

import java.util.ArrayList;
import java.util.List;

public class ListPrac {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println(ls.get(2));
		System.out.println(ls.contains(10));
		System.out.println(ls.indexOf(20));
		System.out.println(ls.size());
		System.out.println(ls.indexOf(20));
		
		ls.remove(0);
		System.out.println("break");
		ls.toString();
		ls.clear();
		System.out.println(ls);
		
		ls.add(0, 30);
		System.out.println(ls);
		ls.set(0,20);
		System.out.println(ls);

	}

}
