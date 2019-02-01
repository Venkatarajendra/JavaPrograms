package superKeyword;

public class SubDemo extends SuperDemo {
	
	int a,b;
	// calling superclass constructor from subclass constructor using super keyword
	SubDemo(int x, int y) {
		super(100,200);
		super.show();
		a = x;
		b = y;
		System.out.println("Sub Constructor called");
	}
	
	void display() {
		System.out.println(a); // 1
		System.out.println(b); // 2
		// using super keyword, accessing the super class variables from subclass
		super.a = 10;
		super.b = 20;
		System.out.println(super.a); // 10
		System.out.println(super.b); // 20
		//using super keyword, accessing super class methods from subclass
		super.show(); // 10, 20
	}
	
	public static void main(String[] args) {
				
		SubDemo obj1 = new SubDemo(1,2);
		obj1.display();
		obj1.a = 11;
		obj1.b = 12;
		obj1.display();
		
	}

}
