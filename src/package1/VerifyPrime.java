package package1;

import java.util.Scanner;

public class VerifyPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to verify the prime or not");
		int n = scan.nextInt();
		int i;
		boolean isPrime = true;
		for (i=2; i<n/2; i++) {
			if (n%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Given number is Prime");
		}
		else {
			System.out.println("Given number is not prime and is divided by : "+i);
		}

	}
}

