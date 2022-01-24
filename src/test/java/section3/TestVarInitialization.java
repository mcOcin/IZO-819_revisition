package section3;

public class TestVarInitialization {

    static int notInitButStatic;
    static int test;

    public static void main(String[] args) {
        System.out.println("Class var not init " + notInitButStatic);

        Foo test = new Foo();
        test.testMyClassVar();
        if(true != false){

        }
    }
}
