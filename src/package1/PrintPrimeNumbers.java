package package1;

import java.util.*;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to print the prime numbers with in given number");
		int n = scan.nextInt();
		//System.out.println(n);
		String prime="";
		for (int i = 1; i<=n; i++) {
			int counter=0;
			for (int num=i; num>=1; num--) {
				if (i%num==0) {
					counter = counter+1;
				}
			}
			if (counter==2) {
				prime = prime+i+" ";
			}
		}
		
		System.out.println("Prime Numbers from 1 to "+n+" are :"+prime);

	}

}
