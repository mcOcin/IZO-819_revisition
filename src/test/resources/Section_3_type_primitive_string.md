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
