package programsJava;

import java.util.Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		
		int a[] = {2,4,8,3,5};
		int b[] = {8,5,4,9,2};
		int c[] = new int[(a.length+b.length)];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println("Merged Array before Sorting: ");
		
		for (int j = 0; j<(a.length+b.length); j++) {
			System.out.print(c[j]+ " ");
		}
		System.out.println("");
		Arrays.sort(c);
		System.out.println("Merged Array after Sorting: ");
		for (int j = 0; j<(a.length+b.length); j++) {
			System.out.print(c[j]+ " ");
		}

	}

}
