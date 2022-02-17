package section5;

public class ArrayTest {

    static String[] test1 = {};
    static String test2[] = {};
    static String[] twoDimensionArray[] = {};
    Integer test[] = new Integer[10];

    public static void main(String[] args) {
        System.out.println("Two empty array of string declared differently: " + test1 + test2);
        System.out.println("Two dimension array declared weirldy" + twoDimensionArray);

        String[] testInitializer;
//        testInitializer = {"coucou"}; // en peut fonctionner car initializer uniquement dispo lors de la décla de l'array.
        Object arrayAreObject = new int[1];
        int[] first, second = first = new int[3];
//        int[] third, four = third = {1,2,3}; // pas d'initialiser sur les compound declarations.
        Integer[] firstArray = new Integer[3];
        Integer linkedArray[] = firstArray;
        firstArray[0] = 69;
        System.out.println("origin: " + firstArray[0] + " linked value: " + linkedArray[0]);

    }
}
