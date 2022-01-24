package section3;

public class ScopeLoopTest {

    public static void main(String[] args) {
        int j = 1;
        // la boucle suivante n'est pas valide parce que c'est comme si on déclarait une deuxième fois la var
        // j
//        for (int i = 0, j = 2; i < 10; i++, j++){
//
//        }
        // Cette loop est OK parce qu'on init la var j dont on se sert pour init ensuite la var i donc pas de nouvelle déclaration.
        for (int i = j = 2; i < 10; i++, j++){

        }
    }
}
