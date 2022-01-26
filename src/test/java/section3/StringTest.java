package section3;

import java.util.Arrays;

public class StringTest {

    static String test3 = "MEMEVALEUR";

    public static void main(String[] args) {
       testingStringEquality();
       testingStringWithArrayConstructor();
       testingPrecedenceOperator();
    }

    public static void testingStringEquality() {
        String fromLitteral1 = "MEMEVALEUR";
        String fromLitteral2 = "MEMEVALEUR";

        System.err.println(String.format("fromLitteral1 == fromLitteral2 ? %b", fromLitteral1 == fromLitteral2));

        String fromLitteral3 = new String("MEMEVALEUR");
        String fromLitteral4 =  new String("MEMEVALEUR");

        System.err.println(String.format("fromLitteral3 == fromLitteral4 ? %b", fromLitteral3 == fromLitteral4));

        String fromLitteral5 = new String("MEMEVALEUR").intern();
        String fromLitteral6 =  new String("MEMEVALEUR").intern();

        System.err.println(String.format("fromLitteral5 == fromLitteral6 ? %b", fromLitteral5 == fromLitteral6));
        System.err.println(String.format("fromLitteral1 == fromLitteral6 ? %b", fromLitteral1 == fromLitteral6));
        System.err.println(String.format("fromLitteral3 with intern() == fromLitteral6 ? %b", fromLitteral3.intern() == fromLitteral6));
    }

    public static void testingStringWithArrayConstructor() {
        int[] source = {110, 111, 112};
        String testGood = new String(source, 0, 3);
        System.err.println("String construct from int array " + testGood);
//        String testTooHighOffset = new String(source, 4, 1);
//        String testTooHighCount = new String(source, 0, 8);
    }

    public static void testingPrecedenceOperator() {
        String resultOfConcatenation = 20 + 10 + "BEGIN STRING" + 10 + 20;
        // Compilateur commence a faire la somme des deux premières opérandes parce qu'il repère deux int.
        // Ensuite il voit le string et prend la suite des additions comme une string concaténation.
        // Voila pourquoi les deux dernières opérandes Int ne sont pas additionnées mais directement transformées en tant que String.
        System.err.println("Resultat de la concaténation : " + resultOfConcatenation);
    }
}
