package stringsPkg;

import java.util.*;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string with while spaces in between");
		String input = sc.nextLine();
		String output = input.replaceAll("\\s+", "");
		System.out.println(output);
		sc.close();
	}

}
