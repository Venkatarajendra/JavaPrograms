package enumExamples;

// enum can be declared outside of the class
enum Beer
{
	KF, KO, RC, FO;
}

public class enumTest1 {
	// enum can be declared inside the class also
	enum Fish
	{
		STAR, GUPPY, GOLD;
	}
	public static void main(String[] args) {
		// enum cannot be declared inside the method otherwise we will get compile time error
		/*enum Month {
			JAN, FEB;
		}*/
		Beer b = Beer.KF;
		Fish f = Fish.GOLD;
		System.out.println(b);
		System.out.println(f);

	}

}
