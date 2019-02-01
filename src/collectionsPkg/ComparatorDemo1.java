package collectionsPkg;

import java.util.*;

/*class Emp implements Comparable {
	String ename;
	int eno;
	
	public Emp(String ename, int eno) {
		this.ename = ename;
		this.eno = eno;
	}
	
	public String toString() {
		return ename+" : "+eno;
	}
	
	
	@Override
	public int compareTo(Object obj) {
		int i1 = this.eno;
		Emp e = (Emp) obj;
		int i2 = e.eno;
		if (i1<i2) {
			return -1;
		}
		else if(i1>i2) {
			return 1;
		}
		else {			
			return 0;
			}
	}
}*/

public class ComparatorDemo1 {

	public static void main(String[] args) {		
		ArrayList<EmpClass> al = new ArrayList();
		al.add(new EmpClass("raj", 101));
		al.add(new EmpClass("bobby", 106));
		al.add(new EmpClass("varsha", 108));
		al.add(new EmpClass("rashmi", 103));
		
		Collections.sort(al);
		System.out.println(al);
		Comparator<EmpClass> c = new Comparator<EmpClass>()
				{

					@Override
					public int compare(EmpClass e1, EmpClass e2) {
						
						return e1.ename.compareTo(e2.ename);
					}
			
				};
				
				Collections.sort(al,c);
				System.out.println(al);

	}

}
