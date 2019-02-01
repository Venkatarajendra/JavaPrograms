package synchronization;

// Example for synchronization with 2 threads try to access the 2 different objects during run time
class Display1 {
	// synchronization is not required in this case 2 threads access 2 different objects and output is irregular as synchronized
	// keyword will not work in this case.
	public synchronized void wish(String name) {
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

class MyThread1 extends Thread {
	Display1 d;
	String name;
	MyThread1 (Display1 d, String name) {
		this.d = d;
		this.name = name;		
	}
	
	public void run () {
		d.wish(name);
	}
}

public class ObjectSync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread1 t1 = new MyThread1(d1,"Dhoni");
		MyThread1 t2 = new MyThread1(d2, "Yuvraj");
		t1.start();
		t2.start();
	}

}
