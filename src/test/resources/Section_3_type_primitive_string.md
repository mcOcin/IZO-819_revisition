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