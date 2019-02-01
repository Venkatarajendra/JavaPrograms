package arraysExamples;

public class PushZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;		
		int[] a = {0,2,5,4,0,0,6,7,0,3,0};
		int n = a.length;
		for (int i=0; i<n; i++) {
			
			if (a[i]!=0) {
				int temp = a[i];
				a[i] = a[count];
				a[count] = temp;
				count++;
				
			}
		}
		
		for (int b:a) {
			System.out.print(b+" ");
		}

	}

}
