package enumExamples;

enum Month
{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;
}

public class EnumValuesOrdinalExamples {
	
	public static void main(String[] args) {
		Month[] m = Month.values();
		
		System.out.println("Ordinal of month: "+Month.JAN+" is "+Month.JAN.ordinal());
		System.out.println("Ordinal of month: "+Month.FEB+" is "+Month.FEB.ordinal());
		System.out.println("Ordinal of month: "+Month.DEC+" is "+Month.DEC.ordinal());
		for (Month m1:m) {
			System.out.println(m1+"..."+m1.ordinal());
		}

	}

}
