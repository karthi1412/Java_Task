package sample;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(60);
		
		System.out.println(set);
		set.remove(20);
		System.out.println(set);
		
		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(6);
		b.add(7);
		b.add(3);
		b.add(4);
		b.add(10);
		
		Set<Integer> un = new HashSet<>(a);
		un.addAll(b);
		System.out.println(un);
		
		Set<Integer> diff = new HashSet<>(a);
		diff.removeAll(b);
		System.out.println(un);
		
		System.out.println(a.equals(b));
		
		for(Integer num:a){
			System.out.println(num);
		}
		
		Set<Integer> inter = new HashSet<>(a);
		inter.retainAll(b);
		System.out.println(inter);
		
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
	}

}
