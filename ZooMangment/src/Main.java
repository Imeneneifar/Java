public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felida", "Tigre", 3, true);

        Zoo myZoo = new Zoo("Esprit Zoo", "Tunis", 20);
        Zoo monZoo = new Zoo(" Zoo", "Tunis", 50);




        //myZoo.displayZoo();


        //System.out.println(lion);
        //System.out.println(tiger);
        //System.out.println(myZoo);

        //instruction10:
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        //instruction12:
        myZoo.addAnimal(lion);

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

        System.out.println("Zoo plein ? " + myZoo.isZooFull());


        //instruction 16:
        Zoo comparer = Zoo.comparerZoo(myZoo,monZoo);
        if (comparer != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + comparer.name);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }







    }
}
