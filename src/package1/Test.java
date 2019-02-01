package package1;

public class Test {

    public static void main(String[] args) {
        BaseClass a = new ConcreteClassOne();
        System.out.println(a.x);
        a.doStuff(); //Called BaseClass Do Stuff
        a.doAbstractStuff(); //Called ConcreteClassOne Do Stuff

        BaseClass b = new ConcreteClassTwo();
        b.doStuff(); //Overriding BaseClass Do Stuff
        b.doAbstractStuff(); //Called ConcreteClassTwo Do Stuff

        BaseClass c = new ConcreteClassThree();
        c.doStuff(); //Called BaseClass Do Stuff
                        //-Overriding BaseClass Do Stuff
        c.doAbstractStuff(); //Called ConcreteClassThree Do Stuff
    }
}
