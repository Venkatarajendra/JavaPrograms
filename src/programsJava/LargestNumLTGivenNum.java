package programsJava;

import java.util.Scanner;

//Program to find largest number less than given number which should not contain given digit also
//Ex: if Num is 145 and digit is 4, output should be 139

public class LargestNumLTGivenNum {
	
	public static int getLessthanGivenNum(int num, int digit) {
		char c = Integer.toString(digit).charAt(0);
		for (int i=num; i>0; i--) {
			if (Integer.toString(i).indexOf(c)==-1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(getLessthanGivenNum(145, 4)); 

	}

}
