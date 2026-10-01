package Thread;

public class MultiThread {

	public static void main(String[] args) {
		
		ThreadOperation operation = new ThreadOperation("Thread1");
		operation.createThread();
		
		ThreadOperation operation1 = new ThreadOperation("Thread2");
		operation.createThread();
		
		ThreadOperation operation2 = new ThreadOperation("Thread3");
		operation.createThread(); 

	}

}
