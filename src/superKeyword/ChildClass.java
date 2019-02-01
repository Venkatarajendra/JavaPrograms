package superKeyword;

public class ChildClass extends ParentClass{
	int b = super.a;
	
	// Overriding a parent class method without throws as a method with throws in subclass but with unchecked type
	@Override
	public void method1() throws ArithmeticException {
		System.out.println("Child's method with no args and no return type");
	}
	
	@Override
	public void method2(int x) {
		System.out.println("Child's method with 1 arg and no return type: "+x);
	}
	
	public static void method3() {
		System.out.println("Child's method with static keyword");
	}
	
	public void method4() {
		System.out.println("Child's own method");
	}
	
	public void method5() {
		System.out.println("Calling Parent Class method and variables using super keyword");
		System.out.println(super.a);
		super.method3();
	}
	
	private void PrivateMethod() {	
		// super.privateMethod(); // we cannot override and call private methods of parent class
		System.out.println("Private Method of Child's Class");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass pc = new ParentClass();
		ChildClass cc = new ChildClass();			
		pc.method2(11);
		//pc.privateMethod(); // we cannot call private methods of parent class in sub class
		cc.PrivateMethod();
		cc.method3();
		cc.method4();
		cc.method5();

	}

}
