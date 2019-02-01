package java8features;

@FunctionalInterface
interface Interf {
	public void m1();
}

public class LambdaExpSample1 {

	public static void main(String[] args) {
		Interf i = ()->System.out.println("Hello, this is sample Lambda exp program");
		i.m1();		

	}

}

// Without Lambda Exp

/*class Test implements Interf
{
	public void m1() {
		System.out.println("Hello, this is sample Lambda exp program");
	}
}

public class LambdaExpSample1 {

	public static void main(String[] args) {
		Interf i = new Test();
		i.m1();

	}

}*/