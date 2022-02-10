package section4;

import java.util.Arrays;

public class SwitchTest {

    public static void main(String[] args) {
        switchExpression();
        switchCasting();
        switchHeritance();
        breakSwitchInLoop();
    }

    private static void breakSwitchInLoop() {
        savepoint:
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("break pour savepoint");
                    break savepoint;
                case 4:
                    System.out.println("case 4");

            }
        }

    }

    private static void switchExpression() {
        final String finalString1 = "un";
        String notFinalString2 = "deux";

        String switchEntry = "TEST";

        switch (switchEntry) {
            case finalString1:
                System.out.println("COUCOU 1");
                break;
//            case notFinalString2:  IMPOSSIBLE PARCE QUE notFinalString2 n'est pas une constante
//                System.out.println("COUCOU2");
//                break;
            case "test" + finalString1:
                System.out.println("COUCOU3");
                break;
//            case "Test2" + notFinalString2: IMPOSSIBLE PARCE QUE notFinalString2 n'est pas une constante
//                System.out.println("COUCOU4");
            case "BIJOUR":
                System.out.println("COUCOU5");
            default:
                System.out.println("DEFAULT");

        }
    }

    private static void switchHeritance() {
        MyEnum testEnum = MyEnum.THIRD;

        switch (testEnum) {
            case FIRST:
                System.out.println("FIRST");
                break;
            case SECOND:
            case THIRD:
                System.out.println("SECOND OU THIRD");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }

    private static void switchCasting() {
        switch ((int) 20.0 * 5) {
            case (int) 100.0:
                System.out.println("CASTING MARCHE");
                break;
//            case 100:
//                break;
            default:
                break;
        }
    }

    private enum MyEnum {
        FIRST,
        SECOND,
        THIRD,
        FOURTH
    }
}
