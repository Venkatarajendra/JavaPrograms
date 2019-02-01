package collectionsPkg;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Collection Interface specific methods:
			1. boolean add(Object o)
			2. boolean addAll(Collection c)
			3. boolean remove(Object o)
			4. boolean removeAll(Collection c)
			5. boolean retainAll(Collection c)
			6. void clear()
			7. boolean isEmpty()
			8. int size()
			9. boolean contains(Object o)
			10. boolean containsAll(Collection c)
			11. Object[] toArray()
			12. Iterator iterator()
			*/
		// Below example is for all above methods
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();
		for (int i=0; i<10; i++) {
			al1.add(i);
		}
		System.out.println(al1.add(null));
		al1.add("raja");
		al1.add(1);
		System.out.println(al1);
		for (int j=10; j<20; j++) {
			al2.add(j);
		}
		System.out.println(al2);
		System.out.println(al3.addAll(al2));		
		System.out.println(al3);
		System.out.println(al1.remove("raja"));		
		System.out.println(al1);
		System.out.println(al3.removeAll(al3));
		System.out.println(al3);
		System.out.println(al3.addAll(al2));
		System.out.println(al3);
		al3.clear();
		System.out.println(al3);
		al3.addAll(al2);
		al3.addAll(al1);
		System.out.println(al3);
		al3.retainAll(al1);
		System.out.println(al3);
		System.out.println(al3.size());
		System.out.println(al3.containsAll(al1));
		System.out.println(al3.contains(12));
		System.out.println(al3.contains(2));
		System.out.println(al2.isEmpty());
		Object[] a = al2.toArray();
		for (int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}

	}

}
