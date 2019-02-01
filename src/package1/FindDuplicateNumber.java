package package1;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,2,4,6,4,7,2};
		int count;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			count = 1;
			if (!(al.contains(a[i]))) {
				for (int j = i+1; j<a.length; j++) {
					if (a[i]==a[j]) {
						count++;
					}
					
				}
				
				if (count>1) {
					System.out.println(a[i] + "is duplicate element");
				}
				al.add(a[i]);
			}
			
			
		}
		System.out.println(al);
		System.out.println("Converting Array List to Array: ");
		Integer b[] = al.toArray(new Integer[al.size()]);
		for (int c : b) {
			System.out.println(c);
		}
		
		System.out.println("Converting Array to Array List: ");
		//List<Integer> l2 = new ArrayList<Integer>();
		//l2 = Arrays.asList(b);
		System.out.println(Arrays.asList(b));
		

	}

}
