package sample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPrac {

	public static void main(String[] args) {
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();
		
		nums.add(10);
		nums.add(90);
		nums.add(50);
		nums.add(30);
		nums.add(5);
		System.out.println(nums);
		
		nums.remove(10);
		nums.size();
		nums.isEmpty();
		nums.clear();
		
		TreeSet<Integer> nums1 = new TreeSet<>();
		nums1.add(80);
		nums1.add(20);
		nums1.add(10);
		nums1.add(90);
		nums1.add(50);
		System.out.println(nums1);
		
	}

}
