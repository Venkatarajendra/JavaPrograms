package stringsPkg;

import java.util.*;

public class FindDupChars {
	
	public static void dupchars(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c:ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		Set<Character> hs = hm.keySet();
		for (char ch1 : hs) {
			if (hm.get(ch1)>1) {
				System.out.println(ch1+" occured "+hm.get(ch1)+" times");
			}
		}
		
	}
	
	public static void main(String[] args) {
		dupchars("rajarajaraja");

	}

}
