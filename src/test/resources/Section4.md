#### Vidéo 37
- Priorité des opérateurs
- increment/décrémentation > Opérateurs unaires > operateurs binaires

#### Vidéo 38
- Attention que les post increment/decrement vont changer la valeur de l'opérande uniquement après que l'expression
dans laquelle elle se trouve est terminée. Par exemple après qu'une assignation soit réalisée.


#### Vidéo 39
 
#### Vidéo 40
- Attention quand on fait a % b si a est plus petit que b le résultat sera égal à a.
- Attention au degré de priorité des opérateurs
- le modulo est dispo aussi pour les floating number en java
- Attention quand on fait un modulo par zéro (10%0) on a une ArithmeticException mais si on fait (10.0%0.0) alors
là on a juste un NaN en résultat.
- Attention aux opérateurs &, &&, |, || savoir quelle partie de la condition sera évaluée.

#### Vidéo 41
- Attention que si on fait byte a =127; a+=1; ça compile mais overflow au runtime mais si on fait a =127; a= a +1;
ça compile pas.

#### Vidéo 42
- Faire attention, surtout quand on utilise le 'var' que java va souvent convertir en int, double, lors des additions,
soustractions. 
- Bien comprendre dans une expression telle que (number-- - number++ * --number) dans quel ordre sont réalisées les opérations
et à quel moment number est modifié par les unary opérators.
- ATTENTION avec  while ((i++ < j) || (j < --k)) comme le || est short circuit la partie de droite n'est pas évaluée
tant que la partie de gauche est vrai. Donc k n'est pas décrémenté avant que la partie de gauche soit fausse.

#### Vidéo 43
- il parle des if et else et switch
- on peut avoir un body pour les if et else vide seulement si on fait if(condition); ou if(...){...}else(); .
Donc avec un ';' sans '{}'
- attention au if else sans {} seul la ligne suivante est considéré comme le body. ça plus du mauvais formatting et on
croit très facilement a du code qui ne compile pas.
- Attention au piège où on pense avoir une condition dans le if mais c'est une assignation et donc on rentre toujours
dans le if en plus de modifier une variable.
- Attention encore au short circuit même dans les if , si on fait if( (a=true) || (b=true) || (c=true)) alors seul la première
assignation a lieu et puis on rentre dans le if , b et c ne sont pas modifié

#### Vidéo 44
- le switch fonctionne avec les enum byte short int char et leur wrapper ainsi que les String
- default n'a pas besoin d'être en dernier
- Attention si on a pas de break, les cases suivants vont être évalués jusqu'a tomber sur le premier break.
- Il est possible de mettre des expressions dans les case d'un switch seulement si elles peuvent être évaluées au
compile time et donc par exemple utiliser deux literal ou bien des constantes. voir SwitchTest.java.
- On peut faire de "l'héritance" de case en les collant voir SwitchTest.
- Si label dupliqué dans un switch alors erreur de compilation.

#### Vidéo 45
- Attention que les label et la param du switch doivent être du même type. Donc si on a un byte en param et qu'on un case
supérieur à 127 alors on sait qu'erreur de compilation.
- Si le switch est dans une loop et que dans un case on a un 'continue;' attention que le reste du switch and co n'est pas
exécuter et qu'on revient direct sur un nouveau tour de boucle.
- Possible d'avoir un Object dans un switch seulement si c'est un wrapper de String ou byte short char int.

#### Vidéo 46
- la partie initialization dans un for est optionel
- loop n'est pas un mot réservé
- break; et continue; dans les loops
- la loop "for(;;);" est une loop infinie qui compile

#### Vidéo 47
- exemple avec des nested loop utilisant un break et continue sur plusieurs labels.
- si une exception se produit durant la partie initialisation du for alors la partie conditional et 'incrémentale' ne
sont pas exécutées.