package section5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        String[] testListOf = {"un", "deux", "trois"};
        List<String> firstList = List.copyOf(Arrays.asList(testListOf));
        assertThat(firstList.size()).isEqualTo(3);
        List<List<String>> secondList = List.of(firstList);
        assertThat(secondList.size()).isEqualTo(1);
        assertThat(secondList.get(0).size()).isEqualTo(3);
        // Value and structural update not possible with List.of and List.copyOf
        assertThrows(UnsupportedOperationException.class, () -> firstList.sort(Comparator.naturalOrder()));
        assertThrows(UnsupportedOperationException.class, () -> secondList.add(List.of()));
        // Only structural and value update is ok with Arrays.asList. Only list size is immutable
        List<String> structuralUpdatePossible = Arrays.asList(testListOf);
        structuralUpdatePossible.sort(Comparator.naturalOrder());
        structuralUpdatePossible.set(0, "newValue");
        assertThrows(UnsupportedOperationException.class, () -> structuralUpdatePossible.add("IMPOSSIBLE"));
    }
}
