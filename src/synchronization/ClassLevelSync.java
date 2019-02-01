package synchronization;



// Example for Class level synchronization with 2 threads try to access the 2 different objects during run time
class Display2 {
	//  in this case 2 threads access 2 different objects and output is regular as we have given static sync method
	// in this case it allows class level lock to allow only one thread at a time
	public static synchronized void wish(String name) {
		for (int i=0; i<3; i++) {
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

class MyThread2 extends Thread {
	Display2 d;
	String name;
	MyThread2 (Display2 d, String name) {
		this.d = d;
		this.name = name;		
	}
	
	public void run () {
		d.wish(name);
	}
}

public class ClassLevelSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread2 t1 = new MyThread2(d1,"Dhoni");
		MyThread2 t2 = new MyThread2(d2, "Yuvraj");
		t1.start();
		t2.start();
	}

}
