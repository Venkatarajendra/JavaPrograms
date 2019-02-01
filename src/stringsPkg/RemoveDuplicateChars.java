package stringsPkg;

import java.util.*;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string with white spaces in between");
		String input = sc.nextLine();
		String output = "";
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		char[] ch = input.toCharArray();
		for (Character c : ch) {
			hs.add(c);
		}
		
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			output = output+itr.next();
		}
		
		System.out.println(output);

	}

}
