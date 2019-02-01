package java8features;

import java.util.*;
import java.util.stream.Collectors;

import org.jsoup.select.Collector;

public class CollectionWithLambdaExp {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(25);
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(2);
		System.out.println(al);
		// Ascending Order
		Comparator<Integer> c = (a,b)->(a<b)?-1:(a>b)?1:0;
		Collections.sort(al, c);
		System.out.println(al);
		al.stream().forEach(System.out::println); // this is stream concept to return the values one by one
		
		// Descending Order
		c = (a,b)->(a<b)?1:(a>b)?-1:0;
		Collections.sort(al, c);
		System.out.println(al);
		al.stream().forEach(System.out::println);
		
		// to print only even numnbers from the given list of elements using stream concept
		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);

	}

}
