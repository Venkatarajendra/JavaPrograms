package programsJava;

import java.util.Scanner;

public class RemoveDuplicatedChars {

	public static void main(String[] args) {
		
		String input,res="";
		int len,i;
		char ch;
		
		System.out.println("Enter the input string");
		Scanner scan = new Scanner(System.in);		
		input = scan.nextLine();
		len = input.length();
		
		for(i=0;i<len;i++) {
			ch = input.charAt(i);
			if(ch!=' ') {
				res = res+ch;
				input = input.replace(ch, ' ');
				//System.out.println(input);
				//System.out.println(res);
			}
		}
		
		System.out.println("Result String is: "+res);
		scan.close();

	}

}
