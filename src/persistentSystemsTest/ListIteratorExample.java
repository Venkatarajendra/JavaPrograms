package persistentSystemsTest;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			al.add(i);
		}
		
		System.out.println(al);
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}

	}

}
