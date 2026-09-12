package sample;
 
public class WhileLoop {

	public static void main(String[] args) {
		int i =0;
		int[] arr = new int[] {10,20,30,40,50};
		
		while(i < arr.length) {
			if(arr[i] == 30) {
				System.out.println("Number Exists" + arr[i]);
				break;
			}
			System.out.println(arr[i]);
			i++;
		}

	}

}
