package sample;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.out.print("Hello");
		System.out.println("Hello");
		
		int a = 14;
		a++;
		System.out.println("a++ " + a);
		a--;
		System.out.println("a-- " + a);
		
		a += 1;
		System.out.println(a);
		a -= 1;
		System.out.println(a);
		
		int num1 = 10;
		int num2 = 20;
		if (num1 == num2) {
			System.out.println("Both Number are Equal");
		}
		else if(num1 >= num2 ) {
			System.out.println("Greater  Number");
		}
		else if(num1 <= num2 ) {
			System.out.println("Lesser  Number");
		}
		else {
			System.out.println("Both Number are UnEqual");
		}
	}

}
