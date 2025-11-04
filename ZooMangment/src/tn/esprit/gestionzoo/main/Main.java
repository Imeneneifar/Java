package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felida", "Tigre", 3, true);

        Zoo myZoo = new Zoo("Esprit tn.esprit.gestionzoo.entities.Zoo", "Tunis", 20);
        Zoo monZoo = new Zoo(" tn.esprit.gestionzoo.entities.Zoo", "Tunis", 50);

        //instruction20:

        Aquatic poisson = new Aquatic("poisson", "poisson", 4, true, "sea");
        Terrestrial cat = new Terrestrial("Felidae", "Tiger", 5, true, 4);

        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 6, true, "Sea", 22.3f);
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 3, false, "Antarctica", 35.5f);




        //myZoo.displayZoo();


        //System.out.println(lion);
        //System.out.println(tiger);
        //System.out.println(myZoo);

        //instruction10:
        //myZoo.addAnimal(lion);
        //myZoo.addAnimal(tiger);
        //instruction12:
        //myZoo.addAnimal(lion);

        //monZoo.addAnimal(tiger);





        //instruction11:
        myZoo.displayAnimals();


        int iLion = myZoo.searchAnimal("Lion");
        System.out.println("Lion trouvé à l'indice : " + iLion);

        int iTiger = myZoo.searchAnimal("Tigre");
        System.out.println("Tiger trouvé à l'indice : " + iTiger);

        int iElephant = myZoo.searchAnimal("Elephant");
        System.out.println("Elephant non trouvé  " + iElephant);


        //instruction 13:
        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();

        //instruction 15:

        System.out.println("Zoo plein ? " + myZoo.isFull());


        //instruction 16:
        Zoo comparer = Zoo.comparerZoo(myZoo,monZoo);
        if (comparer != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + comparer.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }


        //instruction 21:

        System.out.println(poisson);
        System.out.println(cat);

        System.out.println(dolphin);
        System.out.println(penguin);


        poisson.swim();
        dolphin.swim();
        penguin.swim();




        // Prosit 6
        Zoo zoo = new Zoo();
        Dolphin d = new Dolphin("Mammal","Flipper",5,true,"Ocean",25.5f);
        Penguin p1 = new Penguin("Bird","Pingu",3,false,"Arctic",18f);
        Penguin p2 = new Penguin("Bird","Skipper",4,false,"Antarctica",22f);

        zoo.addAquaticAnimal(d);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        zoo.makeAllAquaticSwim();

        System.out.println("Max penguin depth = " + zoo.maxPenguinDepth());

        zoo.printCountsByType();

        Penguin p3 = new Penguin("Bird","Pingu",3,false,"Arctic",30f);
        System.out.println("p1 equals p3 ? " + p1.equals(p3));



        //prosit7
        try {
            zoo.addAnimal(new Dolphin("Dauphin", "Flipper", 5, true, "Mer", 10f));
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(" Erreur : " + e.getMessage());
        } finally {
            System.out.println("Nombre total d’animaux : " + zoo.getAnimalCount());
        }


    }
}