package superKeyword;

public class AbstractInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.m2();
	}

}

abstract class Parent {
	public static int a = 10;
	static void parent() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println(super.a);
		super.parent();
		System.out.println("child method");
	}
}
