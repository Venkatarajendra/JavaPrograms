package package1;

import java.util.Scanner;

public class FactorialRecursion {
	public static int factorial(int n) {
		int res;
		if(n==1) {
			return 1;
		}
		res = factorial(n-1) * n;
		return res;		
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any positive number");
		int x = scan.nextInt();
		int fact = factorial(x);
		System.out.println("Factorial of "+x+" is : "+fact);
	}

}
