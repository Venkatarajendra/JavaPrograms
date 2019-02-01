package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		ArrayList<Integer> obj = new ArrayList<Integer>();
		while(n>0) {
			
		if (n>9) {
			int temp = n%10;
			obj.add(temp);
			n = n/10;
		}
		else {
			obj.add(n);
			break;
		}
		}
		Collections.sort(obj);
		System.out.println(obj);
		int res = 0;
		for(int i=obj.size()-1; i>=0; i--) {
			res = res*10+obj.get(i);
		}
		System.out.println("Result is: "+res);
		scan.close();

	}

}
