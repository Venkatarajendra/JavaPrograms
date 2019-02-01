package package1;

 public class PrivateModifierExample {
	 protected int a = 10;
	public static void main (String[] args) {
		PrivateClass pc = new PrivateClass();
		//System.out.println(pc.i); // we get compile time error when we try to access private variable outside the class
		System.out.println(pc.j); // accessing default variable outside the class and within pkg
		System.out.println(pc.k); // accessing protected variable outside the class and within pkg
	}
}

  class PrivateClass {
	//private int i = 1; // Private variable cannot be accessed outside the class
	 int j = 2; // this is default modifier and can be accessed within the same package but not outside pkg
	 protected int k = 5;
}
