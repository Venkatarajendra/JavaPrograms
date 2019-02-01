package persistentSystemsTest;

public class ExceptionHandlingTricky {
	static void method1(int a, int b) {
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Catch block of method1");
			throw e;
		}
	}	
	
	
	public static void main(String[] args) {
		try {
			method1(1,0);
		}
		catch(NullPointerException ne) {
			System.out.println("Catch block of main method");
		}

	}

}
