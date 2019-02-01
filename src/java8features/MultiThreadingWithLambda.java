package java8features;

// Lambda exp can be used in Multithreading since Runnable interface is Functional interface
public class MultiThreadingWithLambda {

	public static void main(String[] args) {
		Runnable r = ()-> { 
			for (int i=0; i<10; i++) {
				System.out.println("child thread");
			}			
		};
		Thread t = new Thread(r);
		t.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}

	}

}
