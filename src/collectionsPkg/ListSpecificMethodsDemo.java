package collectionsPkg;

import java.util.*;

public class ListSpecificMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Below are the 8 List(I) specific methods which are applicable all List objects like AL, LL etc
		 * 1. boolean add(int index, object o)
		 * 2. Object get(int index)
		 * 3. int indexOf(Object o)
		 * 4. int lastIndexOf(Object o)
		 * 5. Object remove(int index)
		 * 6. boolean addAll(int index, Collection c)
		 * 7. Object set(int index, Object newObj)
		 * 8. ListIterator listIterator()
		 */
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		for(int i=0; i<10; i++) {
			al1.add(i);
		}
		al1.add(2, "raja");
		al1.add("raja");
		System.out.println(al1);
		System.out.println(al1.indexOf("raja"));
		System.out.println(al1.lastIndexOf("raja"));
		System.out.println(al1.set(2, "Dandu"));
		System.out.println(al1.get(2));
		for (int j = 10; j<15; j++) {
			al2.add(j);
		}
		System.out.println(al2);
		System.out.println(al2.addAll(3, al1));
		System.out.println(al2);
		System.out.println(al2.remove(5));
		System.out.println(al2);
		

	}

}
