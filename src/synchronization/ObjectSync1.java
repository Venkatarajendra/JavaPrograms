package synchronization;

// Example for synchronization with 2 threads try to access the same object during run time
class Display {
	// method with synchronized allows only one thread to access while executing to get proper output
	// without synchronized keyword we will get irregular output. this is called object level synchronization.
	public synchronized void wish(String name) {
		for (int i=0; i<5; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException ie) {
				
			}
			
			System.out.println(name);
		}
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	MyThread (Display d, String name) {
		this.d = d;
		this.name = name;		
	}
	
	public void run () {
		d.wish(name);
	}
}

public class ObjectSync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}
