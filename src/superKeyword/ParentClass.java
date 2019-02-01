package superKeyword;

public class ParentClass {
	int a = 10;
	
	public void method1() {
		System.out.println("Parent's method with no args and no return type");
	}
	
	public void method2(int x) {
		System.out.println("Parent's method with 1 arg and no return type: "+x);
	}
	
	public static void method3() {
		System.out.println("Parent's method with static keyword");
	}
	
	private void privateMethod() {
		System.out.println("Private method of Parent class");
	}
	
}
