package package1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "rajendra";
		String res = "";
		for (int i=0; i<s1.length(); i++) {
			res = s1.substring(i, i+1)+""+res;
			
		}
		System.out.println(res);
		
		String res1 = "";
		for (int i=0; i<s1.length(); i++) {
			res1 = s1.charAt(i)+""+res1;
		}
		System.out.println(res1);

	}

}
