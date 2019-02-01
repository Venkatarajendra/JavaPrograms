package interviewTrickyQuestions;

// What will happen if you put return statement or System.exit () on try or catch block? Will finally block execute?

// Read more: http://www.java67.com/2012/09/top-10-tricky-java-interview-questions-answers.html#ixzz5XlQVvqdH

public class Tricky2 {
	
	public String m1 () {
		try {
			System.out.println("this is try block");
			//return "abc";
			//System.out.println(1/0);
			//System.exit(0);
		}
		catch(Exception e) {
			System.out.println("this is catch block");
			System.exit(0);
		}
		finally {
			System.out.println("this is finally block");
			
		}
		
		return "xyz";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tricky2 t = new Tricky2();
		System.out.println(t.m1());
	}

}
