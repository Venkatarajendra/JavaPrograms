package java8features;

import java.util.*;

class Employee
{
	String ename;
	int eno;
	Employee(String ename, int eno){
		this.ename = ename;
		this.eno = eno;
	}
	
	public String toString()
	{
		return eno+":"+ename;
	}
}

public class SortingEmpUsingLambda {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("raj", 101));
		al.add(new Employee("dandu", 111));
		al.add(new Employee("bobby", 105));
		al.add(new Employee("venkat", 109));
		al.add(new Employee("bangaru", 100));
		System.out.println(al);
		// Sorting based on eno in Ascending order
		Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(al);
		
		// Sorting based on eno in Ascending order
		Collections.sort(al,(e1,e2)->(e1.ename.compareTo(e2.ename)));
		System.out.println(al);

	}

}
