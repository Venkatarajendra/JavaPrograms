package programsJava;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharsInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rajendraedJaar";
		char[] ch = new char[s.length()];
		int cnt;
		for (int i=0; i<s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		
		List<Character> l = new ArrayList<Character>();
		for (int j=0; j<ch.length; j++) {
			cnt=1;
			if (!(l.contains(ch[j]))) {
				for (int k=j+1; k<ch.length; k++) {
					if (ch[j]==ch[k]) {
						cnt++;
					}
					
				}
				if (cnt>1) {
					System.out.println("Duplicate character is: "+ch[j]+" occured: "+cnt+" times");
				}
				l.add(ch[j]);
			}
		}
		
		

	}

}
