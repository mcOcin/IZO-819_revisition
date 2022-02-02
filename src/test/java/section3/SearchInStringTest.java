package section3;

public class SearchInStringTest {

    public static void main(String[] args) {
        lastIndexOfTests();
    }

    public static void lastIndexOfTests() {
        String fullText = "FULLTEXT FULLTEXT FULLTEXT";
        String searchString = "TEXT";

        System.err.println("lastIndexOf TEXT: " + fullText.lastIndexOf(searchString));
        System.err.println("lastIndexOf TEXT: " + fullText.lastIndexOf(searchString, 16));
        // On peut voir ici que c'est le même index qu'a la ligne préc car même si on part dans le mot, lastIndexOf
        // va repérer le mot en entier.
        System.err.println("lastIndexOf TEXT: " + fullText.lastIndexOf(searchString, 14));
    }
}
