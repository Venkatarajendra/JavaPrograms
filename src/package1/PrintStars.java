package package1;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, k=0;
		int m = n;
		for (int i=1; i<=n; i++) {
			
			for (int j=m; j>0; j--) {
				System.out.print(" ");
			}
			m--;
			while (k!=i) {
				System.out.print("* ");
				k++;
			}
			k=0;
			System.out.println("");
		}
		
      /*for (int i=n-1; i>=1; i--) {
			
			for (int j=1; j<n; j--) {
				System.out.print(" ");							
			}
			m--;
			while (k!=i) {
				System.out.print("*");
				k++;
			}
			k=0;
			System.out.println("");
		}*/


	}

}
