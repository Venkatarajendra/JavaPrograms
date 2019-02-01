package polymorphism;

class X1
{
    public X1(int i)
    {
        System.out.println(myMethod(i));
    }
    
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
class Y1 extends X1
{
    public Y1(int i, int j)
    {
        super(i*j);
        
        System.out.println(myMethod(i, j));
    }
    
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}

public class Overriding2 {
	public static void main(String[] args)
    {
        Y1 b = new Y1(12, 21);
    }   
}
