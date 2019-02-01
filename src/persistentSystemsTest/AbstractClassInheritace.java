package persistentSystemsTest;

abstract class A{
	static int a = 10;
	static void m1() {
		System.out.println("Abstract Class");
	}
	void xyz() {
		System.out.println("xyz method of parent class");
	}
}
class B extends A {
	void m2() {
		System.out.println(super.a);
		super.m1();
	}
	void xyz() {
		super.xyz();
		System.out.println("xyz method of child class");
	}
}
public class AbstractClassInheritace {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m2();
		b.xyz();

	}

}
