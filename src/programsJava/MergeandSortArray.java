package programsJava;

import java.util.Arrays;

public class MergeandSortArray {

	public static void main(String[] args) {
		
		int a[] = {2,4,8,3,5};
		int b[] = {8,5,4,9,2};
		int c[] = merge(a, b);
		for (int j = 0; j<(a.length+b.length); j++) {
			System.out.print(c[j]+ " ");
		}
		
	}
		
		static int[] merge(int[] arr1, int[] arr2) {
			
			int l1 = arr1.length;
			int l2 = arr2.length;
			int[] c = new int[l1+l2];
			int i=0, j=0;
			
			for (int k=0; k<(l1+l2); k++) {
				
				
				if(i>=l1) {
					c[k] = arr2[j];
					j++;
				}
				else if(j>=l2) {
					c[k] = arr1[i];
					i++;
				}
				else {
					if(arr1[i] < arr2[j]) {
						c[k] = arr1[i];
						i++;
					}
					else {
						c[k] = arr2[j];
						j++;
					}
				}
			}
			Arrays.sort(c);
			return c;
			
		}
		

	

}
