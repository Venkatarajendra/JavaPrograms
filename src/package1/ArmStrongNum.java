package package1;

public class ArmStrongNum {
	static int n=8208;
	
	int getDigitscount(int num) {
		int count=0;
		
		while (num>0) {
			num = num/10;
			count++;
		}
		System.out.println("Count of digits is: "+count);
		return count;
	}
	int getPowerofNum(int count, int val) {
		int res=1;
		for (int i=1; i<=count; i++) {
			res = res*val;
		}
		//System.out.println("Power of value: "+val+" is: "+res);
		return res;
	}
	
	public static void main (String[] args) {
		int temp=n;
		//int temp1=0;
		int d, p, result=0;
		ArmStrongNum asn = new ArmStrongNum();
		d = asn.getDigitscount(temp); // d=3
		//System.out.println("temp value before: "+temp);
		while (temp>0) {						
			int temp1 = temp%10;
			p= asn.getPowerofNum(d, temp1);
			result = result+p;
			temp = temp/10;
			
		}
		if (result==n) {
			System.out.println("Given Number is Arm strong number");
		}
		else {
			System.out.println("Given Number is not Arm strong number");
		}
	}

}
