package package1;

public class ConcreteClassTwo extends BaseClass{

    @Override
    public void doStuff() {
        System.out.println("Overriding BaseClass Do Stuff");
    }
    @Override
    public void doAbstractStuff() {
        System.out.println("Called ConcreteClassTwo Do Stuff");
    }
}

