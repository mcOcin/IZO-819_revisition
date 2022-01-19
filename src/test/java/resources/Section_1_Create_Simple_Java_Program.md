### Why Java 11 ?

- It's a LTS version.
- Will be maintained / enhanced until 2026
- Many vendors have their own implementation (JDK, java development kit) of java like Oracle, Amazon.. Any reputed JDK is OK.
- Amazon, RedHat, AdoptOpenJDK are the most famous java vendors.

## Packages and Imports
### Packages
- Les packages permettent de structurer le projet, rassembler les class, ce sont comme des namespaces.  
On peut utiliser la commande `java` avec l'option `-cp` pour classpath pour exécuter notre programme java.
L'arguemtn -cp prend en premier paramètre le chemin du dossier racine contenant le projet et en deuxième param le nom de la class
main a exécuter de manière complète (avec son package). Exemple: java -cp src test.java.getting.started.FirstClassInPackage
- On peut compiler nos class java via le compiler kava `javac` avec l'option -d pour spéciifer le folder (créer avec la commande)
où le résultat de la compilation ira. Par exemple: javac -d build src/test/java/getting/started/FirstClassInPackage.java  
**REMARQUE**: on peut voir qu'avec la commande javac la terminaison de fichier .java est utilisée contrairement à l'utilisation de la commande java.
Si on ne précise pas de folder avec la commande javac le résultat de compilation se mettre dans le même dossier que la/les classes compilées.
### Import
- Les import 'fully qualified' où l'on nomme la class précédé de son nom de package entier. Utile quand on importe plusieurs class
portant le même nom au sein de la même class. Le fully qualified name permettra de toujours pointer de manière unique une class.
- Les import classiques.
- Les import wildcard déconseillés car peu lisible, on ne peut ne plus savoir d'où viennent les classes utilisées.
- les import static pour ne plus avoir à référencer le nom de la classe pour appeler la méthode static concernées.
