package stringsPkg;

import java.util.Scanner;

public class RemoveWhiteSpace1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string with while spaces in between");
		String input = sc.nextLine();
		String[] str = input.split(" ");
		String output = "";
		for (int i=0; i<str.length; i++) {
			output = output+str[i].trim();
		}
		
		System.out.println(output);

	}

}
