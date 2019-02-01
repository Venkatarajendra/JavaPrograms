package arraysExamples;

import java.util.Arrays;

// Program to Sort an array of numeric elements using Arrays class
public class NumericArraySorting {

	public static void main(String[] args) {
		int[] a = {11,88,44,23,45,21};
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(a));
	}

}
