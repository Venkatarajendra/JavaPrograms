package package1;

public class ConcreteClassThree extends BaseClass{

    @Override
    public void doStuff() {
        super.doStuff();
        System.out.println("-Overriding BaseClass Do Stuff");
    }
    @Override
    public void doAbstractStuff() {
        System.out.println("Called ConcreteClassThree Do Stuff");
    }
}

