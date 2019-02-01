package java8features;

import java.util.function.*;

// Below program returns Square of given number using functional programming feature with Lambda exp

public class FunctionalProgram1 {

	public static void main(String[] args) {
		Function<Integer,Integer> f = i->i*i; // Functional programming with Lambda expression
		System.out.println("Square of 40 is : "+f.apply(40));
		System.out.println("Square of 50 is : "+f.apply(50));

	}

}
