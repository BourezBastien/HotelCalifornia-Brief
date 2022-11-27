# HotelCalifornia-Brief

  

***Vous êtes sur le point de commencer le développement d'une application de gestion de réservation de chambres d'hotel. Pour cela vous aller effectuer des recherche sur les notions de base de l'orienté objet Une fois les notions assimilé vous aller les appliquer dans la future application.***

  

[Lien vers le brief](https://drive.google.com/file/d/1f-dQb_lETyE73m1Mr4ciShAwDe-WjYAZ/view?usp=sharing)

  

### Sommaire:

- [Qu'est-ce que la Programmation Orientée Object]()

- [Object]()

- [Classe et Types de Classes]()

- [Héritage]()

- [Polymorphism]()

- [Abstraction]()

- [Encapsulation]()

- [Sources]()

  

## Qu'est-ce que la Programmation Orientée Object

  

![poo](https://i.ytimg.com/vi/m_MQYyJpIjg/maxresdefault.jpg)

  

### Introduction

  

*La programmation orientée objet (POO) est un paradigme informatique consistant à définir et à faire interagir des objets grâce à différentes technologies, notamment les langages de programmation (Python, Java, C++, Ruby, Visual Basic .NET, Simula...). On appelle objet, un ensemble de variables complexes et de fonctions, comme par exemple un bouton ou une fenêtre sur l’ordinateur, des personnes (avec les noms, adresse...), une musique, une voiture... Presque tout peut être considéré comme un objet.*

  

***L’objectif de la programmation orientée objet est de se concentrer sur l’objet lui-même et les données, plutôt que sur la logique nécessaire et les actions à mener pour faire cette manipulation.***

  

## Objects

  

![Exemple object](https://liongueststudios.com/wp-content/uploads/2021/04/classes-and-objects-pictorial-view-in-java-lionguest-studios-website-1024x578.png)

  

**Un objet est caractérisé par plusieurs notions** :

  

-  **Les attributs**: *Il s'agit des données caractérisant l'objet. Ce sont des variables stockant des informations d'état de l'objet*

-  **Les méthodes**: Les méthodes d'un objet caractérisent son comportement, c'est-à-dire l'ensemble des actions (appelées _opérations_) que l'objet est à même de réaliser. Ces opérations permettent de faire réagir l'objet aux sollicitations extérieures (ou d'agir sur les autres objets). De plus, les opérations sont étroitement liées aux attributs, car leurs actions peuvent dépendre des valeurs des attributs, ou bien les modifier*

-  **L'identité**: *L'objet possède une identité, qui permet de le distinguer des autres objets, indépendamment de son état. On construit généralement cette identité grâce à un identifiant découlant naturellement du problème (par exemple un produit pourra être repéré par un code, une voiture par un numéro de série, etc.)*

  

**Exemple** ( Voir le schéma ci-dessus ):

  

- Nous avons défini une Class **Car** celle ci prend en compte des attributs, dans notre cas **company** et **speed** ce sont ces attributs qui vont nous permettre de différentier nos **objects** qui seront crée a partir de notre class **Car** qui sert de pattern.


## Classe

![classe](https://www.swiftement.fr/wp-content/uploads/2019/01/schemaPoo.png)

  

On appelle **classe** la structure d'un objet, c'est-à-dire la déclaration de l'ensemble des entités qui composeront un objet. Un objet est donc « issu » d'une classe, c'est le produit qui sort d'un moule. En réalité on dit qu'un objet est une **instanciation** d'une classe, c'est la raison pour laquelle on pourra parler indifféremment d'**objet** ou d'**instance** (éventuellement d'_occurrence_).

  

Une classe est composée de deux parties :

  

-  **Les attributs** (parfois appelés _données membres_) : il s'agit des données représentant l'état de l'objet

-  **Les méthodes** (parfois appelées _fonctions membres_): il s'agit des opérations applicables aux objets

  

### Les types de classe

  

En ce qui concérne **java** il existe plusieurs type de classe:

-  **Classe statique**

	- On peut rendre une classe statique s'il s'agit d'une classe embarquée. Nous pouvons aussi dire que les classes statiques sont désignées sous le nom de classes imbriquées. Cela signifie qu'une classe déclarée statique dans une autre classe se nomme une classe statique. La classe statique imbriquée ne requiert aucune référence à la classe extérieure.

-  **Le but d'une classe statique est de fournir le contour de sa classe héritée.**

```java

classe publique StaticClassExample {

    Chaîne statique privée str = "Javatpoint";

    // classe imbriquée qui est une classe statique

    classe statique publique StaticDemo {

        //méthode non statique de la classe Static

        public void show() {

            System.out.println(str);

        }

    }

    public static void main(String args[]) {

        StaticClassExample.StaticDemo obj = new StaticClassExample.StaticDemo();

        obj.show();

    }

}

```

-  **Classe finale**

	- La classe **finale** est déclarable avec l'aide du mot **class final**. Une fois que la classe est définie comme **finale**, ce qui signifie que les valeurs restent les même tout au long du programme. Le but de mettre une classe en **finale** c'est de la rendre immuable.

-  **la classe finale ne peut pas être prolongée. Cela empêche également la classe d'être sous-classée.**

  

``` java

//classe finale

classe finale A {

    annuler printmsg() {

        System.out.print("La méthode de la classe de base est exécutée.");

    }

}

//Classe dérivée

//extension d'une classe finale qui n'est pas possible

// l'erreur ne peut pas hériter de la classe finale au moment de la compilation

la classe B prolonge A {

    annuler printmsg() {

        System.out.print("La méthode de la classe dérivée est exécutée.");

    }

}

// classe principale

classe publique FinalClassExample {

    public static void main(String[] arg) {

        B obj = nouveau B();

        obj.printmsg();

    }

}

```

  

-  **Classe abstraite**

	- Une **classe abstraite** est une qui est déclarée avec le mot clé **abstract** . Elle peut ou ne peut pas contenir de méthodes abstraites. Nous ne pouvons pas créer une instance d'une classe abstraite, mais il peut s'agir d'une sous-classe. Ces classes sont incomplètes, donc en complément de la classe abstraite, nous avons besoin d'étendre les classes abstraites à une classe concrète. Quand nous déclarons une sous-classe comme abstraite, nous devons assurer la mise en œuvre de méthodes abstraites. Par conséquent, la sous-classe doit également être déclarée abstraite. Nous pouvons réaliser le masquage des données en utilisant la classe abstraite

  

```java

// classe abstraite

classe abstraite MathematicalOperations {

    entier a = 30, b = 40;

    //méthode abstraite

    public abstract void add();

}

L 'opération de classe publique étend MathematicalOperations {

//définition de la méthode abstraite

public void add() {

    System.out.println("La somme de a et b est : "

        a + b);

}

public static void main(String args[]) {

    MathematicalOperations obj = nouvelle opération();

    obj.add();

}

}
```


**Exemple**:

  

- Si on définit la classe **voiture**, les objets **Peugeot 406, Renault 18** seront des

**instanciations de cette classe**. Il pourra éventuellement exister plusieurs objets **Peugeot 406**,

différenciés par leur numéro de série. **Deux instanciations de classes pourront avoir tous

leurs attributs égaux sans pour autant être un seul et même objet**.

- C'est le cas dans le monde réél, deux T-shirts peuvent être strictement identiques et pourtant ils sont distincts. D'ailleurs, en les mélangeant, il serait impossible de les distinguer...

  
## Héritage 

![héritage illustration](https://image.slidesharecdn.com/poo-chap4-heritagepolymorphisme-180327123743/75/poo-java-chapitre-4-heritage-et-polymorphisme-2-2048.jpg?cb=1666727356)


L'héritage  est un principe propre à la programmation orientée objet, permettant de créer une nouvelle classe à partir d'une classe existante. Le nom d'"héritage" (pouvant parfois être appelé dérivation de classe) provient du fait que la classe dérivée (la classe nouvellement créée) contient les attributs et les méthodes de sa superclasse (la classe dont elle dérive).

- Certains langages orientés objet, comme C++, permettent plusieurs héritages, ce qui signifie qu'ils offrent la possibilité d'hériter d'une classe de deux superclasses. Par conséquent, cette technique permet de grouper au sein d'une même classe les attributs et méthodes de plusieurs classes.

-   L'intérêt majeur de l'héritage est de pouvoir définir de nouveaux attributs et de nouvelles méthodes pour la classe dérivée, qui viennent s'ajouter à ceux et celles héritées.

## Polymorphism

![](https://upload.wikimedia.org/wikipedia/commons/4/4c/Polymorphism.png)
  
le **polymorphisme** est utilisé en relation avec **les fonctions, les méthodes et les opérateurs**. Des fonctions et des méthodes de mêmes noms peuvent avoir des **comportements différents** ou effectuer des **opérations sur des données de types différents**. On distingue 2 types de polymorphisme, la **surcharge** et la **redéfinition**.

- La **surcharge** est une possibilité offerte par certains langages de programmation qui permet de choisir entre **différentes implémentations** d'une même **fonction** ou **méthode** selon le nombre et le type des arguments fournis. Le polymorphisme ad hoc ne doit pas être confondu avec le polymorphisme d'inclusion des langages à objets, permis par l'héritage de classe et la redéfinition de méthode (overriding en anglais).

## Abstraction

![](https://i.ytimg.com/vi/1eSCCQPBqP0/maxresdefault.jpg)

L’abstraction est l’un des concepts clés dans les langages de programmation orientée objet (POO).Son but principal est de gérer la complexité en masquant les détails superflus pour l'utilisateur. Ceci permet à l'utilisateur de mettre en œuvre une logique plus complexe sans comprendre ni même penser à toute la complexité cachée.

**Exemple**:

![exemple abstraction](https://4.bp.blogspot.com/-cXMovacqc0U/W-p2Lhg6NaI/AAAAAAAAC-g/E0uquZrAuekmi-FL_z82qPneIKYuECqcwCLcBGAs/s1600/Exemple%2Bde%2Bclasse%2Babstraite%2BJava.png)

 Pour donner un exemple d’abstraction, nous allons créer une super-classe appelée « Forme » et deux sous-classes – « Rectangle » et « Cercle ». Les deux sous-classes ont des propriétés communes à partager, comme la couleur. Il existe une différence majeure entre le rectangle et le cercle à savoir: la surface, la largeur, la taille et le rayon …

## Encapsulation

![encapsultion](https://www.data-transitionnumerique.com/wp-content/uploads/2021/03/encapsulation.png)

> Dans le schéma précédent, la boîte noire masque les détails d’implémentation des attributs et des actions de la classe. Elle cache les attributs _couleur, poids, prix_. Le grand avantage de ce procédé est qu’en tant qu’utilisateur, on n’a plus à se préoccuper de comment est fait l’intérieur de l’objet de classe _Voiture_. On n’a plus besoin de se préoccuper sur le nombre d’attributs dans la classe _Voiture_. On se contente de connaître comment manipuler une voiture à l’aide des services offerts par la classe.

L'encapsulage sert à définir les niveaux de visibilité des éléments de la classe. Ces niveaux de visibilité définissent ce que l'on appelle la plage (ou le périmètre) de l'attribut ou de la méthode. La portée est ainsi définie par méthode et par attribut et indique les droits à leur accès. On distingue trois niveaux de visibilité :

-   **Publique (+)**: les attributs publics sont accessibles à tous
-   **Protégée (#)**: les attributs protégés sont accessibles seulement dans la classe elle-même et aux classes dérivées
-   **Privée (-)**: les attributs privés sont accessibles seulement par la classe elle-même

### En Résumer:

- La **programmation orientée objet** est un outil incroyable pour **améliorer la qualité, la lisibilité et la modularité de votre code.** Le concept d’**héritage** permet notamment de simplifier la personnalisation de contenu créé par d’autres. Elle **regroupe** un ensemble de termes (**classes**, **instances**, **méthodes**, **attributs**). Nous parlerons des ces termes tout au long de cette présentation.

-  **Un objet** est un bloc de code mêlant des variables et des fonctions, appelées respectivement attributs et méthodes. Les attributs définissent les caractéristiques d’un objet d’une classe, les méthodes définissent quant à elles les fonctions propres aux instances d’une classe.

-  **Une classe** est un ensemble de code contenant des variables et des fonctions permettant de créer des objets. Une classe peut contenir plusieurs objets. Il existe des types de classe différente qui correspondront chacun a un type de projet.

- **L'héritage** c'est un mécanisme qui va permettre, comme son nom l'indique, de **transmettre** toutes les méthodes d'une classe dite **mère** vers une autre dite **fille** et ainsi de suite.

- le **polymorphisme** est utilisé en relation avec **les fonctions, les méthodes et les opérateurs**. Des fonctions et des méthodes de mêmes noms peuvent avoir des **comportements différents** ou effectuer des **opérations sur des données de types différents**. On distingue 2 types de polymorphisme, la **surcharge** et la **redéfinition**.

- **L’abstraction** est l’un des concepts clés dans les langages de programmation orientée objet (POO). Son but principal est de **gérer la complexité** en masquant les **détails superflus** pour l'utilisateur. Ceci permet à l'utilisateur de mettre en œuvre une **logique plus complexe** sans comprendre ni même penser à toute la **complexité cachée**
- **L'encapsulation** est comme un mécanisme de boîte noire qui empêche l’utilisateur d’utiliser un objet au delà des méthodes qui lui sont proposées.

### Sources:

- [Types de classe](https://www.javatpoint.com/types-of-classes-in-java)
- [Polymorphisme](https://fr.wikibooks.org/wiki/Programmation/Programmation_orient%C3%A9e_objet/Polymorphisme)
- [Héritage](https://web.maths.unsw.edu.au/~lafaye/CCM/poo/heritage.htm)
- [Concept Object](https://web.maths.unsw.edu.au/~lafaye/CCM/poo/objet.htm)
- [Encapsulation](https://www.data-transitionnumerique.com/encapsulation-poo/)
