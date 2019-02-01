package enumExamples;

enum Beer1
{
	CB,TUBORG,BW;
}

public class EnumVsSwitch {
	
	public static void main(String[] args) {
		Beer1 b1 = Beer1.CB;
		switch(b1)
		{
		case CB: 
			System.out.println("It's CarlsBurg");
		case BW: 
			System.out.println("It's BudWiser");
		case TUBORG: 
			System.out.println("It's my Brand");
		default: 
			System.out.println("Other brands are not recommended");
		}

	}

}
