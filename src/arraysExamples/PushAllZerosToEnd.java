package arraysExamples;

import java.util.*;

public class PushAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,0,4,0,5,6,0};
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		for (int b:a) {
			if (b==0) {
				al1.add(b);
			}
			else {
				al2.add(b);
			}
		}
		
		al2.addAll(al1);
		System.out.println(al2);
		
		

	}

}
