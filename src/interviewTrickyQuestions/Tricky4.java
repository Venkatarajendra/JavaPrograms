package interviewTrickyQuestions;

import java.util.Arrays;

public class Tricky4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = new char[] {'\u0097'}; 
		String str = new String(chars); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes));

		
	}

}
