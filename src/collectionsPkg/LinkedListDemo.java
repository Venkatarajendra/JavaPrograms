package collectionsPkg;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LinkedList class specific methods:
		 * void addFirst()
		 * void addLast()
		 * Object getFirst()
		 * Object getLast()
		 * Object removeFirst()
		 * Object removeLast()
		 */
		
		LinkedList l = new LinkedList();
		for (int i =0; i<10; i++) {
			l.add(i);
		}
		l.add("raj");
		l.add(null);
		System.out.println(l);
		l.addFirst("Dandu");
		l.addLast("Last Element");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);

	}

}
