package package1;

import java.util.ArrayList;

// Program to find the occurences of each number in the array

public class ArrayElementOccur {

	public static void main(String[] args) {
		int[] arr = {2,4,6,2,8,9,8,4,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i<arr.length; i++) {
			
			int count = 1;
			
			if(!al.contains(arr[i])) {
				
				for (int j = i+1; j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				
				al.add(arr[i]);
				System.out.println(arr[i]+" Occurs "+count+ "time(s)");
			}
			
			
		}
		

	}

}
