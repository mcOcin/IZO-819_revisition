package section1.lessons;

import section1.lessons.package1.*;
import section1.lessons.package2.ClassWithSameName;
import section1.lessons.staticimport.TestClasseStatic1;

import java.util.Arrays;

import static section1.lessons.staticimport.TestClassStatic2.*;
import static section1.lessons.staticimport.TestClasseStatic1.STATIC_VAR;
//import section1.lessons.staticimport.TestClasseStatic1;

public class ProgramToTestImport {

    public static void main(String[] args) {
        ClassWithSameName test = new ClassWithSameName();
        // ici on peut voir que c'est la classe avec le single import qui prend le prio et pas celle avec le wildcard.
        test.print();

        //Pareil ici c'est la var static single imported qui prend la priorité
        System.out.println("Test quelle var static ? " + STATIC_VAR);

        // Attention la ligne suivante n'est possible que si l'import à la ligne 11 est décommenté.
//        TestClasseStatic1.staticMethod();
    }
}

//class ClassWithSameName {
//    public void print() {
//        System.out.println("class locale");
//    }
//}