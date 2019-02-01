package java8features;

import java.util.function.*;

// Below program is to check whether given number is even number or not using predicates of functional programming

public class PredicatesProgram {

	public static void main(String[] args) {
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(11));

	}

}
