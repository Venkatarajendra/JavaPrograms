package package1;

public class RemoveDupEleFromArr {

	public static void main(String[] args) {
		int a[] = {10,30,30,20,10,40,50,30,40};
		int l = a.length;
		int j=0;
		boolean flag = true;
		for (int i=0; i<l; i++) {
			flag = true;
			for (int k= i+1; k<l; k++) {
				if (a[i] == a[k] )
					flag = false;
			}
			if (flag) {
				a[j] = a[i];
				j++;
			}
		}
		
		for (int m=0;m<j;m++) {
			System.out.print(a[m]+" ");
		}

	}

}
