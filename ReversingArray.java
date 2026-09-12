package sample;
import java.util.Arrays;
public class ReversingArray {

	public static void main(String[] args) {
		int [] arr = new int[] {10,20,30,40,50};
		int [] arrN = new int[arr.length];
		int size = 0;
		
		for (int i=arr.length-1; i>-1; i --) {
			arrN[size] = arr[i];
			size++;
		} 
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrN));
	}

}
