package superKeyword;

public class MethodOverriding extends A {
	void m1() {
		//super.m1();
		System.out.println("child method");
	}
	void m2() {
		//super.m1();
		System.out.println("child method m2");
	}
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		A a = new MethodOverriding();
		//obj.m1();
		a.m1();
		a.p();
		obj.p();
		
		//obj.m2();
	}
}

class A {
	void m1() {
		System.out.println("Parent method");
	}
	
	void p() {
		System.out.println("Parent p method");
	}
}
