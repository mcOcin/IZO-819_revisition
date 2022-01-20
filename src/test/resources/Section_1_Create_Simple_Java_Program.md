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
#### Vidéo 8
- Les import 'fully qualified' où l'on nomme la class précédé de son nom de package entier. Utile quand on importe plusieurs class
portant le même nom au sein de la même class. Le fully qualified name permettra de toujours pointer de manière unique une class.
- Les import classiques.
- Les import wildcard déconseillés car peu lisible, on ne peut ne plus savoir d'où viennent les classes utilisées.
- les import static pour ne plus avoir à référencer le nom de la classe pour appeler la méthode static concernées.

#### Vidéo 9
- Pas besoin de spécifier les import pour tout ce qui vient du package java.lang
- Si on utilise une class avec son 'fully qualified name' pas besoin de mettre d'import.
- les import wildcard Exemple: import org.nico.bg.*;
- Si deux classes de même noms sont importés mais l'une de manière wildcard et l'autre de manière single class import,
  alors c'est celle en single import qui sera par défaut utilisée. Voir exemple dans ProgramToTestImport.java.
- Il n'est pas possible de créer une classe locale dans le même fichier si un fully qualified import pour une classe du
  même nom est déjà présent. Voir ProgramToTestImport.java.
- Quand on fait un wildcard '*' cela n'importe que les classes du même niveau que le wildcard et pas également tout
  ce qui se trouve plus bas dans la hiérarchie du package.

#### Vidéo 10
- La définition du package doit obligatoirement être la première ligne de code du fichier.
- quand on fait un import static cela va uniquement importer les classes méthodes et attributs static du package concerné.

#### Vidéo 11
- il est possible de créer une classe qui n'aura pas de package et elle sera mis dans le package unnamed dans ce cas là
- on peut aussi dire que la classe est dans le package portant son nom
- la structure des packages n'est pas forcément obligé de suivre la structure des dossiers.
- Il est possible de créer une classe qui a le même nom qu'une classe qui vient du package java.lang. Le seul hic est
qu'il faudra utiliser le fully qualified name de classe du java.lang portant le même nom si on veut l'utiliser au sein de notre classe.

#### Vidéo 12
- attention avec les import static il y a le même système de priorité entre single class import et wildcard.
- un import static d'une var d'une class ne vas pas importer la classe. Il faudra import également la class
si on veut utiliser des méthodes static de cette dernière.
- pas d'import static sur les class.