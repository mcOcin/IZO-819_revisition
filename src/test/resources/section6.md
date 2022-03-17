#### Vidéo 60
- Il parle des différentes manières de déclarer les variables.
- on ne peut pas faire de multiple déclarations sur une même ligne si les var sont de type différents.
- Attention qu'on peut faite "Object a = new Object(), s = new String("test");" parce que le string est déclaré
comme un Object et est casté.

#### Vidéo 61
- La JVM alloue de l'espace dans la mémoire HEAP pour les variables.
- En java on ne peut pas désallouer manuellement la mémoire HEAP mais on peut déférencer les var et ou les rendre null
pour qu'elles soient éligibles pour le garbage collector.
- les var locales et de méthodes sont auto déférencée quand on quitte le scope de la var.
attention que si la méthode retourne une référence d'une var celle ci n'est pas déréfencer à la fin de la méthode.

#### Vidéo 62
- la structure d'une class (class modifier + nom de class + type generic + nom de la superclass + nom des super interface + body)
- Si pas de class modifier alors elle est package access par défaut.
- seul les nested class peuvent protected et private et static.

#### Vidéo 63
- les constructeurs, block d'initialisation (static ou non) ne sont pas overridable par héritage.
- les block d'initialisation sont exécutés dans leur ordre de définition. ils seront toujours exécutés avant le constructeur
de la classe hormis ceux de la super class si il y a.
- On ne peut pas mettre de return,this,super dans les block d'initilization

#### Vidéo 64
- L'assignement des variables d'instances s'exécutent dans l'ordre de leur définition et avec le même niveau de priorité
que les block d'initialization. L'assignement des var static avec le même ordre de prio que les block static et les var d'instance
avec le même ordre de prio que les block d'instance.

#### Vidéo 65
- Attention que dans les block d'init on ne peut pas utiliser de var qui sont déclarées plus loin hormis si c'est pour leur
assigner une valeur.
- Attention que si on est dans une sous class le constructeur de la ou les class parents sera appelé en tout premier,
même avant les block. L'ordre serait donc : constructeur parent, block d'init et assignment, constructeur de la classe.






