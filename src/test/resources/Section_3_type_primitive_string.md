### Type primitifs
#### Vidéo 15
- Java ne peut pas être vrmt considéré comme un langage purement orienté objet car la JVM autorise d'utiliser des 
types primitifs qui ne sont pas des objets car ils n'héritent pas de la classe Object. On les utilise souvent pour 
améliorer les performances.
- Retenir la taille de chaque type, les valeurs min et max.

#### Vidéo 16
- Si on veut déclarer plusieurs variables de plusieurs types différents sur une même ligne alors obligé de séparer
les types par un ;.
- Par défaut quand on tape un chiffre entier java l'interprète en int de 32 bits.
- par défaut quand on tape un chiffre décimale java l'interprète en double de 64bits.
- Tous les types primitifs peuvent recevoir un literal numeric jusqu'a 127, même un char.
- On peut placer des _ dans les chiffres pour améliorer la lisibilité mais pas n'importe où.
- on peut mettre 'e10' pour l'exponentiel.
- on ne peut pas assigner null aux types primitifs
- on ne peut pas assigner 0 à un boolean primitif, juste true ou false.

#### Vidéo 17
- tous les types prim. ont une valeur par défaut donc pas besoin de les initialiser.
- les types prim numériques ont 0 par défaut
- le boolean a false par défaut
- C'est OK de pas init les var locales mais il faudra obligatoirement le faire avant de pouvoir s'en servir.
- Faire attention aux var locales qui sont init que sous certaines conditions (if) sans bloque else et qui donc
pourrait ne pas être init dans certain cas. Si ce n'est pas init dans tous les cas, il y aura erreur de compilation
sur la première ligne qui tente d'utiliser la var potentiellement non init.
- si on init la var locale dans un bloque 'if(true)' qui sera toujours ok alors pas de soucis de compil, le compilateur comprend
qu'on passera toujours dans le if.
- Pareil pour les switch en fonction de si ils ont ou pas un bloc default.
- pareil avec les while qui n'ont pas de condition (true).

#### Vidéo 18
- Narrowing = quand on met un plus gros type dans un plus petit . Comment ???
- Widening = quand on met un type plus petit dans un plus grand.
- Si on assigne directement une valeur out of range du type comme donné 128 à un byte alors que le max est 127 alors on
aura une erreur de compilation.

#### Vidéo 19


#### Vidéo 20

#### Vidéo 21
Les différents scope qu'une variable peut avoir sont:
- Class (variables static définie au niveau de la class)
- Instance (variables non static définies au niveau de la class) (référencée par this.....)
- Méthode (au sein d'une méthode, paramètre aussi)
- Loop (par exemple for(int i = 0, i < max; i++){} où i est une var de loop).
- Loop block
- Block including exception block

#### Vidéo 22
- REMARQUE:  
  Attention que si on a le code:
  int j = 1;
  **for (int i = 0, j=1; i < MAX; i++, j++)){}** cela ne va pas compiler parce qu'on déclare deux fois la var 'j'. PAR CONTRE
  si on fait **for (int i = j = 1; i < MAX; i++, j++)){}** alors là c'est ok parce qu'on fait juste qu'init 'j' pour ensuite
  init la var 'i'!

#### Vidéo 23
- Voir test dans la classe ScopeWithInnerClassTest.java et ScopeLoopTest.java pour les subtilités.

#### Vidéo 24
- LVTI Local variable type inference , quand on type un variable avec le mot 'var'
- ce mot clé 'var' est disponible uniquement pour les variables locales donc dans les méthodes. Et il faut que l'opérande de droite de l'assignation
retourne bien le type.
- 'var' n'est pas un keyword, on peut l'utiliser comme nom de variable par exemple. on peut meme faire 'var var = "test":'
- on peut assigner un objet null à 'var' mais on ne peut pas assigner null directement sinon il ne pourra pas inferer le type. 
- on ne peut pas l'utiliser sur une ligne de déclaration multiple comme 'var j=0, i =0;'
- on est obligé d'assigner une valeur directement sur la ligne de création de la variable.
- on en peut pas utiliser l'array initialization pour le var comme 'var test = {'first', 'second'};'
- on ne peut pas faire d'array de var comme 'var[] test = ["test1", "test2", "test3"];'
- donc PAS DE STATIC et PAS DE VARIABLE D'INSTANCE (de classe) et PAS DE PARAMETRE DE METHODE.
- Le 'var' est disponible pour les lambdas depuis la version 11.
- on peut l'utiliser pour déclarer une 'var' dans les boucles.

#### Vidéo 25
- attention si on a un 'short test = 1' et qu'on fait 'var i = +test' le i sera de type int a cause du sigle '+'
- on peut faire un var avec un 'new ArrayList<>()' parce que l'ArrayList n'a pas besoin de type pour se créer
- on peut faire un var avec un 'new String[5]'

#### Vidéo 26
- String est un objet que l'on peut créer sans constructeur, sans mot clé 'new'
- Si on assigne le même String literal à deux var différentes l'opérateur '==' retournera true
- Par contre si on construit deux strings via le constructeur new String("") là '==' retournera false sauf en utilisant la méthode
intern() sur ces String on ira chercher la référence dans le String pool.
- String est immutable. Quand on update un string avec un concaténation par exemple, une nouvelle ref est crée à chaque fois.
- Attention que le méthode 's1.concat(s2)' ne va pas modifier s1 mais créer une nouvelle ref, un nouveau String, qu'on récupère dans le retour.
- intern() va rechercher dans le pool string une référence avec cette valeur, si elle n'existe pas le call intern() ajoute cette valeur dans le pool.s

#### Vidéo 27
- bien retenir que les constructeurs de String avec un arry et des params en plus c'est un offset inclusive, qui commence donc à 0 et
que le param suivant est le nombre de caractère a compté à partir de l'index de départ. Si l'on donne un trop grand nombre
de caractère ou si l'offset de départ est trop loin par apport a l'array, on aura une runtime exception.

#### Vidéo 28
- pas oublier que si on met un objet dans une string concatenation, c'est le résultat de la méthode toString() de l'objet qui
sera utilisé dans la concaténation.
- Attention a la precedence des opérateurs ! voir StringTest.java

#### Vidéo 29
- Le premier chara d'un string est toujours à l'index 0.
- les méthodes avec un index de début et de fin sont toujours inclusive (start) puis exclusive (end).
- Pour comparer les String on a les méthodes 'equals' , 'equalsIgnoreCase', 'isBlank', 'isEmpty', 'contentEquals', 'compareTo'
- Faire attention que la méthode 'equals' accepte un object en param mais retournera forcément false si le param n'est pas un String.
- Faire attention que la méthode 'equalsIgnoreCase' accepte uniquement un String en param.
- Pour rechercher des char dans un string on peut utiliser 'equals/equalsIgnoreCase' 'indexOf', 'lastIndexOf',
'endsWith', 'startsWith', 'matches'
- Pour manipuler 'concat', 'replace', 'replaceAll', 'replaceFirst', 'join', 'split', 'substring', 'subsequence'
- Faire attention que les méthodes de comparaison retournent souvent des boolean à l'exception des méthodes
compareTo and compareToIgnoreCase retournent des int (0 en cas d'égalité).

#### Vidéo 30
- lastIndexOf avec un int en deuxième param indique l'index de départ (inclusive) et va rechercher
en revenant vers le début du String pour la dernière occurence du premier param.
- Attention avec lastIndexOf même si on part au milieu d'un mot que l'on recherche il va le compter comme entier.
Voir méthode lastIndexOfTests().
- Dans le package java.util.regex on a Pattern et Matcher pour rechercher des string.
- On compile() un Pattern dans lequel on peut intégrer des regex ensuite on appel la méthode matcher(String input)
pour retourner un Matcher avec lequel on fera matches() pour savoir si le string en input match le pattern compiler.
- .regionMatches(int startindex, String toSearch, int start, int end) premier param indique où inclusivement on commence 
la recherche dans le string appelant. Les deux derniers param indique le début et la fin de la région à prendre dans le deuxième
param. On peut avoir un boolean en premier param pour indiquer si oui ou non on ignorecase.

#### Vidéo 31
- Concaténation de string en utilisante des listes, array avec join(), +=, StringJoiner.
- split() peut prendre un string en param mais aussi des regex. mais aussi un int pour indiquer le nombre d'elem
max que l'on veut dans le [] résultant. Si on met 2 split() va donc couper le string max une fois.

#### Vidéo 32
- méthode replace()
- attention méthode replaceAll() ne va pas remplacer toutes les occurences mais la premières trouvées.
- substring() a un ou deux param start and end.
- subsequence() a toujours deux param required.
- repeat() qui prend un int en param pour indiquer le nombre de répétition à faire. Si on donne 0 en param alors
le string n'est pas du tout répéter et un string vide est retourné. Si param négatif alors illegalArgument.
- strip() est similaire à trim() mais en mieux car contrairement a trim() qui se sert de l'unicode U+0020(un espace) il
se sert de Character.isWhitespace
- String est immutable mais StringBuilder est mutable
- valueOf et new String() utilisent un index de début (toujours inclusive) et une longueur après mais toutes les autres méthodes
utilisent un index de début et de fin.

#### Vidéo 33
- attention que la méthode replace(char target, char replace)  AVEC CHAR UNIQUEMENT retourne le même string si elle n'a pas rien trouvé à remplacer ou si 
on donne la même valeur pour les deux params. Donc l'opérateur == retournera true si on compare résultat et origine.
- Si on utiliser replace(String target, string replace) alors là un nouveau string sera créer d'office.
- Si on fait un origine.substring(0, origine.length()) alors pas de nouveau string créé non plus.
- Si on fait String s5 = s4 + s3 +s2 +s1 en réalité on va créer 3 string avant pour faire le s5 car c'est évalué ainsi
String s5 = (s4+ (s3 + (s2 + s1)))

#### Vidéo 34
- StringBuilder plus perf quand on fait bcp de concaténation.
- StringBuilder a 4 constructeurs diff.
- StringBuilder a une capacity , qui est mise à jour dés qu'on le modifier. par défaut 16.
- Attention qu'avec les StringBuilder == ou .equals() revient a la même chose que le .equals() correspond à la définition
qu'il y a dans Object.
- Pour comparer les valeurs de StringBuilder on peut les convertir en String avec toString() ou utiliser Comparator avec compareTo()
- append() insert( ) avec toutes leur possibilités de param.
- Attention que ces méthodes vont modifier direct la valeur dans le StringBuilder qui est mutable et ne pas retourner de valeur
contrairement aux méthodes de String qui vont créer un nouveau String retourné.
- indexOf , deleteCharAt() , delete()
- ATTENTION reverse() attention cette méthode retourne un nouveau StringBuilder en plus de modifier l'appelant. Le StringBuilder
dans le retour n'est qu'une copie, == va donc retourner true si on test.
- ATTENTION substring() va retourner un String qui n'est donc pas lié à la valeur du StringBuilder appelant.

#### Vidéo 35
- trimToSize() ne va pas enlever les whitespace du sb mais diminuer la capacity pour la mettre à la même valeur que le nombre de caractère.
- si l'on veut réellement trim() un sb alors on fera sb.toString().strip() ce qui mettra a jour la length du sb mais pas sa capacity.
- getChars() méthode fournie par Sb et String. Fonctionne uniquement avec char et pas CharSequence.
fonctionne uniquement avec un array de char[] initialisé. Si l'array est pas assez grand que pour contenir les char
extraits alors on a indexoutofbound
- 


