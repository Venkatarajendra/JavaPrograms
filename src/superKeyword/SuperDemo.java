package superKeyword;

public class SuperDemo {
	
	int a,b;
	
	SuperDemo(int x, int y) {
		a = x;
		b = y;
		System.out.println("Superclass constructor called");
	}
	
	void show() {
		System.out.println(a);
		System.out.println(b);
	}

}
