package polymorphism;

class A1
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
class B1 extends A1
{
    static void methodOne()
    {
        System.out.println("BBB");
    }
}

public class Overriding3 {
	public static void main(String[] args)
    {
        A1 a = new B1();
        
        a.methodOne();
    }  
}
