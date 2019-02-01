package package1;

public class SecondHighestArrayElement {
	
	public static void main(String[] args) {
		int[] a = {18,2,10,12,15,8};
		int len = a.length;
		int firstHighest = a[0];
		int secondHighest = 0;
		
		for (int i=0; i<len; i++) {
			
			if(a[i]>firstHighest) {
				secondHighest = firstHighest;
				firstHighest = a[i];
			}			
			else if(a[i]==firstHighest) {
				firstHighest = a[i];
			}
			else if(a[i]>secondHighest) {
				secondHighest = a[i];
			}
		}
		
		System.out.println("Second Highest element in an Array is: "+secondHighest);
	}

}
