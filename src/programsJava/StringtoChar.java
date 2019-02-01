package programsJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class StringtoChar {

	public static void main(String[] args) {
		
		String str = "Dandu Venkatarajendra";
		char[] charArray = str.toCharArray();
		String res = Arrays.toString(charArray);
		System.out.println(str.length());
		System.out.println(charArray); // to print character array
		System.out.println(res);
		
		// below code is to remove the duplicate characters from a given string
		//using LinkedHashSet
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		int len = str.length();
		for ( int i=0; i<len; i++) {
			
			String ch = str.substring(i, i+1);
			lhs.add(ch);
			//len = len-1;			
			
		}
		
		System.out.print(lhs);
		System.out.println();		
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.print(s);
			
		}
		

	}

}
