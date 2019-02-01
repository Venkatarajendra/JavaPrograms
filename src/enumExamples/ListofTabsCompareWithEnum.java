package enumExamples;

import java.util.*;

/*Interview Question: There is a list of tabs displayed on web page. write code to verify all the 
  tabs along with count using enum. For example: Requirement, Planning, General, Execution, Results
 * 
 */

enum Tabs {
	REQUIREMENT,PLANNING,GENERAL,EXECUTION,RESULTS;
}

public class ListofTabsCompareWithEnum {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("REQUIREMENT");
		al.add("PLANNING");
		al.add("GENERAL");
		al.add("EXECUTION");
		al.add("RESULTS");		
		
		Tabs[] t = Tabs.values();
		int tabsLen = t.length;
		if (al.size()==tabsLen) {
			System.out.println("inside if condition");
			for (Tabs t1 : t)
				if (al.contains(t1.toString())) {
					System.out.println(t1.toString()+" is available in the list");
				}
				else {
					System.out.println(t1.toString()+" is not available in the list");
				}
			//System.out.println(t1.toString()); // need to covert from enum type to string to compare with list of String type
		}

	}
	
	

}
