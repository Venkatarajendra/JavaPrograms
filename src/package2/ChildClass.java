package package2;

import package1.*;

public class ChildClass extends PrivateModifierExample{
	void m1() {
		System.out.println(super.a); // accessing protected variable outside the pkg through inheritance
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cc = new ChildClass();
		cc.m1();

	}

}
