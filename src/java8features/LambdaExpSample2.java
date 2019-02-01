package java8features;

interface A
{
	public int m1(int a, int b);
}

public class LambdaExpSample2 {

	public static void main(String[] args) {
		//A i = (a,b)->System.out.println("Sum of given numbers is : "+(a+b));
		//A i = (a,b)->(a+b); // Valid
		A i = (a,b)->{return (a+b);}; // valid
		//A i = (a,b)->{(a+b);}; // Invalid as we didn't use return keyword
		
		System.out.println(i.m1(20, 40));

	}

}
