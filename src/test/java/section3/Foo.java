package section3;

public class Foo {

    int notInitNotstatic;

    public void testMyClassVar() {
        System.out.println("int class var not init and not static " + notInitNotstatic);
    }

    public void testMyLocalVar() {
//        int notValidBecauseLocal;
//        System.out.println("Wont compile because local var must be initialised. " + notValidBecauseLocal);
    }
}
