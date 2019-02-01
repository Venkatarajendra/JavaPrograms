package collectionsPkg;

import java.util.*;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		TreeSet<EmpClass> t = new TreeSet<EmpClass>(new MyComparator());
		t.add(new EmpClass("raj", 101));
		t.add(new EmpClass("bobby", 106));
		t.add(new EmpClass("varsha", 108));
		t.add(new EmpClass("rashmi", 103));
		System.out.println(t);
		// to print the values one by one from the list/set 
		for(EmpClass e : t) {
			System.out.println(e);
		}

	}

}

class MyComparator implements Comparator<EmpClass> {

	@Override
	public int compare(EmpClass e1, EmpClass e2) {
		
		return e1.ename.compareTo(e2.ename);
	}
	
}
