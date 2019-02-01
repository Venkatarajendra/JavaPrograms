package stringsPkg;

// Program to find the length of the string without using length method

public class FindStringLength {

	public static void main(String[] args) {
		int count=0;
		String str = "Rajendra";
		for(char c : str.toCharArray()) {
			count++;
		}
		
		System.out.println("Length of the String "+str+" is : "+count);
		
		int i=0;
		String str1 = "Venkata Rajendra";
		try {
			while(true) {
				str1.charAt(i);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Length of the String "+str1+" is : "+i);
		}

	}

}
