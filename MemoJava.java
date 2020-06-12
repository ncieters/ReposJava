import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

//import java.util.*;

/* #region -------Commentaires  */


// Commentaire sur une seule ligne

/*
Commentaire sur plusieurs lignes
*/
/* #endregion */

/* #region TYPES  */
//---------------------------------------
//-------les types
//-----------------------------------
public class MemoJava {
    /** Le programme commence ici */
    
    enum Direction {
        north, east, south, west;
    }
    
    public static void main(String[] args) {
       
       /*Commentaires /*  et  // ligne simple
       System.out.println("Hello World!");
        System.out.println("Hello World!1");
        System.out.println("Hello World!277888");
        System.out.println("Hello World!27788833333333");*/
        //-------------------------------
        /*types */
        //-------------------------------
        String text = "A wonderful string that consists of multiple characters";
        //concatenation avec +
        int numberOfVowels = 0;

        float fs = 0; //precision 7 decimales, au dela double
        double percentageOfVowels = 0.0;
        boolean myb=true;

        System.out.println(myb);

        int t=2;
        int bonusAllowance=500;
        System.out.println(t + fs); 
        

        //Déclarez la variable int ongoingAllowance
        int ongoingAllowance = 200;
        //Déclarez la variable int savings
        int savings = 3000;
               
        //Affiche le résultat
        System.out.println("You have an ongoing allowance of " + ongoingAllowance +"\nYour savings amount is " + savings +"\nYou have a bonus allowance of " + bonusAllowance);
        
        System.out.println(text + numberOfVowels + percentageOfVowels);
        
        /*test
        new project junit test par exemple  (helloworldtest)
         et faire run --> run as junitTest

         dans onglet junit barre verte si ok et rouge sinon
	
        */

        /*Maven 
        
        -facilite la construction de projets java 
        n apportant des tâchesautomatisées. Par exemple, il télécharge automatiquement les bibliothèques Java dont vous pouvez avoir besoin. 
        Pour cela, il suffit simplement de créer un fichier de description au format XML : le pom.xml.
        
        */

        int a = 10;
        int b = 4;
        double c = (double) a / b;
        double d = a / (double) b;

        System.out.println(c);
        System.out.println(d);
        
        String favoriteCity = "Buenos Aires";
        int numberOfTrips = 5;

        String story = "I've traveled to " +favoriteCity+ " " +numberOfTrips+ " times!"; // -> "I've traveled to Buenos Aires 5 times!"

        System.out.println(story);

//en ligne de commande javac MemoJava.java genere MemoJava.class (bytecode) et java MemoJava pour exceuter

         // Déclarez et créez une chaîne de caractères
         String shockingSentence="The Java String type actually is a class, not a simple type!";
         // Faites-le savoir
         System.out.println(shockingSentence.toUpperCase());
         // Inversez-le
         System.out.println(shockingSentence.replace("simple","primitive"));

        // ne rien garder dans votre fonction main qui puisse être extrait vers une fonction
        
        int loopLimit = 101;

        int iterations = 0;
        /* boucle et conditions*/
        if(true){

        }
        int q=1;
        int s=2;
        if(q==s) {
            // instructions
            } 
        else if(q>6) {
            System.out.println("t");
        } 
        else {
            System.out.println("zz");
        }

        switch(args.length) {
            case 0: // aucun argument n'a été envoyé
                //sayHelloTo("world");
                break;
            case 1: // l'utilisateur a fourni un argument dans le terminal 
                // sayHelloTo(args[0]);
                break;
            case 2: // l'utilisateur a fourni 2 arguments
                // sayHelloTo(args[0] + "-" + args[1]);
                break;
            default: // l'utilisateur a fourni plus d'arguments qu'on peut en gérer !
                System.out.println("Sorry, I don't know how to manage more than 2 names!");
        }

        Direction direction = Direction.north;
        switch (direction) {
            case north:
                System.out.println("You are heading north");
                break;
            case east:
                System.out.println("You are heading east");
                break;
            case south:
                System.out.println("You are heading south");
                break;
            case west:
                System.out.println("You are heading west");
                break;
        }
        /* opérateur de comparaison
        ==  égal à (exactement le même) ;

        !=  non égal à (différent, de quelque façon que ce soit) ;
    
        <  inférieur à ;
    
        <=  inférieur ou égal à ;
    
        >  supérieur à ;
    
        >=  supérieur ou égal à.
        */
        /* operateurs logiques
        &&  ET logique.
        Le résultat n'est vrai que si toutes les parties participantes sont vraies. 
        Exemple : le résultat de  expression1 && expression2  n'est vrai que si  expression1  est vraie ET  expression2  est également vraie.
    
        ||  OU logique.
        Le résultat est vrai si au moins une des parties participantes est vraie. 
        Exemple : le résultat de  expression1 || expression2  est vrai si  expression1  est vraie OU  expression2  est vraie. Il en sera de même si les deux expressions sont vraies !
    
        !  NON logique.
        Il inverse simplement l'expression donnée.
        Le résultat de  !expression1  est vrai si  expression1  est fausse ; le résultat est faux si  expression1  est vraie.
        */

        for (int i=5;i< loopLimit;i++) {
        
            iterations += 1;
            System.out.println(iterations);
        }
        //continue et break
        for ( int i=0; i <10; i++) {
            // déclarations exécutées à chaque itération
                if(i == 2 || i == 5) {
                continue;
                }
            // déclarations non-exécutées quand i == 2 or 5
            }

        String[] basket = new String[]{"apple", "orange", "banana"};

        for (int i =0; i<basket.length;i++) {
            if (basket[i] == "orange") {
            System.out.println ("I have an " +basket[i]+ " !");
            break;
            }
        }    

        int[] myArray = new int[]{7,2,4};

        for (int i=0; i<myArray.length; i++) {

        System.out.println(myArray[i]);

        }

        int numberOfTrees = 0;

        while (numberOfTrees < 10) {
            numberOfTrees += 1;
            System.out.println("I planted " + numberOfTrees + " trees");
        }

        System.out.println("I have a forest!");

        int pushUpGoal = 10;
        do{
            System.out.println("Push up!");
            pushUpGoal -= 1;
        } while(pushUpGoal > 0);
        //encapsulation
        /*
        public : visible pour tous et par conséquent le moins restrictif ;

        protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;
    
        package-protected (protégé par paquet) : généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut) ;
    
        private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé).

        Dans l'exemple ci-dessus, la classe est déclarée  public. Puisque la classe est l'élément contenant, cela signifie que tous les éléments de cette classe peuvent être du même niveau d'exposition d'un niveau inférieur. Dans ce cas, cela comprend tous les niveaux.

        Si vous déclarez une classe comme  private, ses éléments ne peuvent être que  package-private  ou  private  :*/
        /*
        PrivateClass a = new PrivateClass(); // Erreur car de niveau package protected et pas private
        private PrivateClass b = new PrivateClass(); // Ok
        private PrivateClass c = new PrivateClass(); // Ok
        */

        //exemple de polymorphisme
        // class Animal {
        //     void deplacer() {
        //     System.out.println("Je me déplace");
        // }

        // class Chien extends Animal {

        //     void deplacer() {
            
        //         System.out.println("Je marche");
            
        //     }
        
        // }

        // class Oiseau extends Animal {
        //     void deplacer(){
        //         System.out.println("Je vole");
        //     }
        // }
        //----------------    
        //tableaux
        //----------------
        
        int[] tb = new int[]{1,2,3};

        System.out.println(tb[0]);

        for(int color:tb){
            System.out.println(color);
        }

        int[] to = {4,5,6};

        for(int color:to){
            System.out.println(color);
        }

        String[] colors = new String[]{"red","jaune","orange","blue"};

        for(String color:colors){
            System.out.println(color);
        }     
        
        String[] cola = new String[5];
        cola[0] = "red";
        cola[1] = "yellow";
        cola[2] = "orange";
        cola[3] = "green";
        cola[4] = "blue";
        System.out.println("-----------");
        for(String color:cola){
            System.out.println(color);
        } 
        //replace disponible pour les string
        String [] strings = {"one",  "two", "three"} ;
        for(String color:strings){
            System.out.println(color);
        } 
        System.out.println(strings.length);
        String strings5[] = {"one",  "two", "three"} ;

        for(String color:strings5){
            System.out.println(color);
        } 
        //---------------------
        //objet List
        //----------------------
        //si taille dynamique alors on peut utiliser arraylist; une liste ne peut stocker que des objets (d'ou la majuscule a Integer)
        //une list est ordonnée, on accede aux elements avec leur indice
        List<Integer> myList = new ArrayList<Integer>();
        //possible de faire ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(7); // -> [7]
        myList.add(5); //-> [7, 5]
        myList.add(1,12); //-> [7, 12, 5]
        myList.set(0,4); // -> [4, 12, 5]
        myList.remove(1); // removed 12 -> [4, 5]
        System.out.println(myList.size()); // -> 2      

        for(int color:myList){
            System.out.println(color);    
        }
        //---------------------
        //objet HashSet
        //----------------------
        //HashSet<String> ingredients = new HashSet<String>();
        Set<String> ingredients = new HashSet<String>();
        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");
        ingredients.remove("salt"); //enlevez du sel des ingrédients
        System.out.println(ingredients.size());

        for(String ingredient:ingredients){
            System.out.println(ingredient);    
        }
        //---------------------
        //objet dictionnaire ou maps
        //----------------------
        //map<String, Integer> myMap = new HashMap<String, Integer>();
        //String type cle et Integer type de valeur
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        //ajout et modification avec put
        myMap.put("Jenny", 34);
        myMap.put("Livia", 28);
        myMap.put("Paul", 31);
        myMap.put("jenny", 21);
        myMap.remove("jenny");
        System.out.println(myMap.get("Jenny")); // -> 34
        System.out.println(myMap.get("jenny")); // -> 21
        System.out.println(myMap.size());

        // Parcours sur les couples de la table.  
        for (Iterator<Map.Entry<String, Integer>> i = myMap.entrySet().iterator() ; i.hasNext() ; ) { 
            Map.Entry<String, Integer> entry = i.next(); 
            System.out.println(entry);  
        } 
        // Parcours sur les clés de la table. 
        for (Iterator<String> str = myMap.keySet().iterator() ; str.hasNext() ; ) { 
            String key = str.next(); 
            System.out.println(key);  
        } 
        // Parcours sur les valeurs de la table. 
        for (Iterator<Integer> i = myMap.values().iterator() ; i.hasNext() ; ) {  
            Integer value = i.next();
            System.out.println(value);  
        }

        //---------------------
        //pasage reference et valeur
        //----------------------

        //type valeur                   : int, float, double,byte, char les vlauer ssont copié : passage par valeur

        int a9=10;
        int b9=a9;
        System.out.println(a9); // -> 10
        System.out.println(b9); // -> 10
        a9 = 15;
        System.out.println(a9); // -> 15
        System.out.println(b9); // -> 10

        //type reference (pointeurs)    : autres objet, l'objet n'est pas copié : passage par reférence

        /*
        public class Car {
            String color = "red";
        }
        Car car = new Car();
        Car carToPaint = car;

        public class Car {
            String color = "red"
        }
        Car car = new Car();
        Car carToPaint = car;
        System.out.println(car.color); // -> red
        System.out.println(carToPaint.color); // -> red
        carToPaint.color = "yellow";
        System.out.println(car.color); // -> yellow
        System.out.println(carToPaint.color); // -> yellow

        En effet, en Java, les paramètres d'une fonction sont des constantes et ne peuvent pas être modifiés, 
        ce qui signifie que vous ne pouvez pas affecter une nouvelle valeur à l'ensemble du nouvel objet (ou une référence à un objet). 
        Mais vous pouvez tout à fait modifier les attributs de cet objet. C'est ce que nous avons fait dans l'exemple ci-dessus.

        Lors des appels de méthode, les arguments sont toujours passés par valeur. 
        Dans le cas des types primitifs (int,  char,  byte, etc.), c'est la valeur de l'argument qui est recopiée dans le paramètre de la méthode.

        */

        //-------------------------------
        // Expression lambda
        //-------------------------------

        //une expression lambda c'est toujours <Liste de paramètres> -> <le corps de la fonction>

        /*

        public interface interfonctionelle1{
            int operation(int operand1, int operand2);
        }

        public interface interfonctionelle2{
            void saymessage(String message);
        }

        public class launcher{

              static int operate(int operand11,int operand22, interfaceFonctionelle1 myInterf){
                    return myInterf.operation(operand11,operand22);

              }  
               //une expression lambda c'est toujours <Liste de paramètres> -> <le corps de la fonction>
              public static void main(String[] args) {
                        interfonctionelle1 add = (int x,int y) -> x+y; //une seule instructions = pas besoin d'accolades sinon accolades
                        interfonctionelle1 multiply = (int x,int y) -> x*y;

                        int resultAdd = operate(2,8, add);
                        int resultMul = operate(2,8, multiply);

                        System.out.println("Resultat addition " + resultAdd); // affiche 10
                        System.out.println("Resultat multiplication " + resultMul); // affiche 16

                        interfonctionelle2 fog = (Strinf message) --> {System.out.println("Hello " + message);};    

                        fog.sayMessage("Super dev ");    //Affiche Hello Super dev
                }
        }


        */
        
        //dernière modif
        
    }
}