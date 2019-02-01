package arraysExamples;

import java.util.*;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			al.add(i);
		}
		System.out.println("ArrayList Elements are: "+al);
		Integer[] a = new Integer[al.size()];
		a = al.toArray(a);				
		System.out.println(a.length);
		for (Integer e:a) {
			System.out.print(e+" ");
		}

	}

}
