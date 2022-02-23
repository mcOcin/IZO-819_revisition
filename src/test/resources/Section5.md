#### Vidéo 48
- En réalité les arrays multidimensionnels n'existent pas en Java mais Java permet leur utilisation via des array d'array.

#### Vidéo 49
- Quand on déclare un array on peut mettre les [] après le type ou après le nom de variable
- Si on met des [] à droite du type et nom de variables alors on a un tableau a deux dimensions ! 
- on ne peut pas définir la taille de l'array dans la déclaration que ce soit a droite du type ou de la variable. (erreur de compilation)
- C'est à la création et non la déclaration d'un array qu'on peut définir sa taille: int[] test = new int[10];
- petit rappel qu'on ne peut pas déclarer des var de types différents sur la même ligne (séparé par un simple ",")
- Quand on crée un array d'object (pas de primitive) on appel pas le constructeur d'objet donc pas de paranthèses
  Integer test[] = new Integer[10];
- array initializer avec les {}
- quand on crée un array avec [] la JVM met des valeurs par defaut dans les elem.
- array initializer uniquement dispo a la déclaration de l'array.
- parce que finalement les arrays sont des objets c'est ok d'assigner à un Objet un new int[10];
- On peut utiliser l'initializer {} + les [] mais alors on ne précise pas de taille dans les []
- pas de initializer avec les compound statement (multiple déclarations sur la même ligne);
- Quand on définit la taille d'un array multidimensionnel seul la taille de niveau un est required
on peut faire int[2][] mais pas int[][2]

#### Vidéo 50
- Attention si on assigne un array a un autre ils vont tous les deux avoir les même références dans le contenu et donc
si l'on modifie l'un on modifie également l'autre

#### Vidéo 51
- le equals sur un array utilise le equals d'Object et retourne donc true uniquement si les deux tableaux ont la même ref.
- Arrays.equals va par contre checked les valeurs et l'ordre des array pour vérifier l'égalité.
- Règles sur Arrays.compare.
  - Si Arrays.equals = true alors compare return 0
  - Si prem params null alors -1 si deuxième param alors 1
  - Si length du prem param 0 alors return 0-length du deuxième
  - Si length du deuxième 0 alors return length du first array
  - en gros on utilise un préfix d'array, le prefix est l'ensemble des elem en commun des arrays , dés qu'une différence
    se fait alors le préfix prend fin puis on comptabilise le retour de compare()
  - Si on compare un petit array avec un plus grand alors retour négatif et si inverse alors retour positif.
- Attention que List.equals compare les valeurs de la list mais Arrays.equals compare les ref.

#### Vidéo 52
- Arrays.binarySearch() permet de rechercher un index d'un élem avec un valeur dans l'array.
si pas trouvé alors -1. l'array doit absolument être trié sinon les résultats de la méthode ne sont pas garantis.
- Si on des elem dupliqués dans l'array on ne sait pas quel index binarySearch() va retourner, il vaut mieux utiliser List.indexOf()
- Arrays.mismatch() retourne l'index à partir duquel la différence entre les deux param se produit.
- containsAll() vérifie si un une list contient tous les elem, peu importe l'ordre.
- list.indexOf(), list.lastIndexOf()

#### Vidéo 53
- Arrays.fill()
- Arrays.sort()
- Arrays.setALl()
- Array.parallelPrefix()
- Array.asList() et puis manipulation de la liste avec get() set() , sort(). Attention que la liste retournée par asList()
a une taille fixe. Comme la taille d'un array qui est fix.
- List.of() List.copyOf() retourne des list immutable et donc si on essaie de modifier leur valeur on tombe sur une 
UnsupportedOperationException

#### Vidéo 54
- Arrays.copyOf(originalArray, maxLength). Si on précise une taille plus petite on prend simplement une partie de l'array donnée.
    Si on donne un taille plus grande alors les elem en plus auront une valeur par défaut en fonction de leur type.
- Array.copyOfRange()
- List.subList()
- Iterator pour parcourir une liste. hasNext() next()
- ListIterator pour parcourir une liste dans les deux sens (hasPrevious(), previous())

#### Vidéo 55
- Attention que quand on a un array multidimensionnel si on fait un Arrays.copyOf() dessus on va juste copier la première dimension
- Si on veut faire une deep copy il faut parser la première dimension et faire un Arrays.clone() sur tous les array de seconde dimension.

#### Vidéo 56
- Montre qu'on peut prendre des int et les mettre dans des Integer ou des long Long parce que java va faire de l'autoboxing
- Par contre on ne peut pas faire de Long[] test = new int[2]; on pourra seulement mettre des int dedans après init.
- Attention que la méthode Arrays.compare utilise la méthode compareTo qui vient de Comparable. Si on a un array de Number qui n'implémente pas
cette méthode, Arrays.compare() ne compilera pas avec cet array.

#### Vidéo 57
- Rappel que List.of() et List.copyOF() retournent des listes immutables.
- Attention que List.of() reçoit un varargs de type E. Donc si on donne une list à List.of() on va récupérer une list d'un seul élément
qui contiendra une liste à l'index 0, une liste de liste.
- Attention que List.of et list.copyOf retournent des list immutables que ce soit en terme de valeur que de structure.
Tandis que Arrays.asList retourne une list immutable en terme de taille mais est mutable en terme de structure et valeur.
- On peut transformer une list en array avec List.toArray() mais si l'array n'est pas assez grand que pour contenir
la liste entière alors rien n'ira dans l'array. Par contre si l'array est trop grand seul le surplus n'est pas rempli.
- On peut ne pas donner d'array en param a List.toArray et on sera sûr que ça passe ou bien donner en param un array de size 0.

#### Vidéo 58
- Méthodes pour clone un array: clone(), copyOF(), copyOfRange(), arrayCopy() (tous des shallow copy mutables)
- Méthodes pour clone list: List.of(), List.copyOf()