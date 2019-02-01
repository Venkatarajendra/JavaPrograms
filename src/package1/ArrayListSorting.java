package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp {
	int id;
	String name;
	
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id+":"+name;
	}
}


public class ArrayListSorting {
	public static void main(String args[]) {
		
		ArrayList<Emp> emp = new ArrayList<Emp>();
		Emp e1 = new Emp(100,"Dandu");
		Emp e2 = new Emp(108,"Venkat");
		Emp e3 = new Emp(101,"Rajendra");
		Emp e4 = new Emp(104,"Bobby");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		Collections.sort(emp, new Comparator<Emp>() {

			@Override
			public int compare(Emp a, Emp b) {
				//This is for sorting based on IDs
				Integer i1 = (Integer)a.getId();
				Integer i2 = (Integer)b.getId();
				return i1.compareTo(i2);				
				
				// This is for sorting based on names
				//return a.getName().compareTo(b.getName());
				
			}
			
		});
		
		for(Emp e:emp) {
		System.out.println(e);
		}
		
	}

}
