package package2;



public class CallByRef {

	public static void main(String[] args) {
		
		Number a = new Number();
		a.x = 4;
		System.out.println(a.x); // 4
		Number b = a;
		b.x = 5;
		System.out.println(b.x); // 5
		
		System.out.println(a.x); // 5

	}

}

class Number {
	
	int x;
}
