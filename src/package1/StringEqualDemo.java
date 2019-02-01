package package1;

public class StringEqualDemo {

	public static void main(String[] args) {
		
		String s1 = new String("ABCD");
		//String s1 = "ABCD";
		String s2 = new String("ABCD");
		//String s2 = "ABCD";
		if(s1.equals(s2)) {
			System.out.println("Hello1");//true
		}
		
		if(s1==s2) {
			System.out.println("Hello2"); // false
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Hello3"); // true
		}

	}

}
