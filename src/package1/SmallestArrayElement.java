package package1;

public class SmallestArrayElement {
	
	public static void main(String[] args) {
		
		int[] a = {15,21,1,3,5,9};
		int len = a.length;
		int smallest = a[0];
		int pos=0;
		
		for(int i=0; i<len; i++) {
			
			if (a[i]<smallest) {
				smallest = a[i];
				pos = i;
			}
		}
		
		System.out.println("Smallest element is: "+smallest+" and position is: "+pos);

	}

}
