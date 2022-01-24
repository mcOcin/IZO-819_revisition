package section3;

import java.util.Arrays;

public class ScopeWithInnerClassTest {

    static String test = "TOP";
//   String test = "TOP"; //On ne peut pas avoir une var de class et une var d'instance de même nom

    public static void main(String[] args) {
        int top = 0;
        String test = "coucou"; // On peut avoir une var de class/instance et une var de méthode de même nom.
        class MyInnerClassForTest {
            {
                System.out.println("top method var still available in inner class " + top);
                // C'est ok de déclarer une var en doublon ici parce que le nouveau 'top' est sous le qualifier MyInnerClassForTest
                for (int top = 0; top < 10; top++) {
                    System.out.println("Quelle var top est print ? " + top);
                    top = 10;
                }
                // Par contre on ne peut pas faire la loop suivante car pour qu'une var soit réf dans une inner class elle doit être final
//                for (top = 10; top < 20; top ++) {
//
//                }
                // Ici comme on réf la var top dans l'inner class ça veut dire qu'on ne pourra plus changer sa valeur après pour qu'elle reste effectively final
                // voir line 32.
                for (int j = top; j < 10; j++) {

                }
            }
        }
        new MyInnerClassForTest();
//        top = 2;
    }
}
