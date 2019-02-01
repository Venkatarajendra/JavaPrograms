package arraysExamples;

import java.util.Arrays;

public class StringArraySorting {

	public static void main(String[] args) {
		String[] s = {"Rajendra", "Bangaru", "Bobby", "Bujjamma"};
		System.out.println("String Array before sorting: ");
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("String Array after sorting: ");
		System.out.println(Arrays.toString(s));

	}

}
