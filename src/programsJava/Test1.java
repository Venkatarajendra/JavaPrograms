package programsJava;
// this program is example of this keyword
public class Test1 {
	
	int i = 1;
	
	public void method1(Test1 ref) {
		System.out.println(ref.i);
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public void method2() {
		
		System.out.println(i);
		
		Test1 ref2 = new Test1();
		this.i = 3;
		i = 6;
		System.out.println(this.i);
		System.out.println(ref2.i);
		method1(this);
		
	}

	public static void main(String[] venkat) {
		
		Test1 ref1 = new Test1();
		ref1.method2();
		System.out.println(ref1.i);

	}

}
