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



