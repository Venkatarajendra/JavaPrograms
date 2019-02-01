package arraysExamples;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		String[] a = {"A","C","D"};
		Integer b[] = {3,2,5,7};
		List al = new ArrayList();
		al = Arrays.asList(a);
		//al.add("44"); // we will get an Runtime Exception here
		System.out.println(al);
		al = Arrays.asList(b);
		System.out.println(al);
		

	}

}
