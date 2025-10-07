package tn.esprit.gestionzoo.entities;

public class Zoo {
    String name;
    String city;

    public String getName() {
        return name;
    }


    //instruction 14:
    public static final int NBR_CAGES = 25;
    Animal[] animals = new Animal[NBR_CAGES];


    int animalCount = 0;



    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Nom du tn.esprit.gestionzoo.entities.Zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + NBR_CAGES);
    }



    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [name=" + name + ", city=" + city +
                ", nbrCages=" + NBR_CAGES + "]";
    }

    //instruction 15:

    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }

    //instruction 10-12:
    public boolean addAnimal(Animal animal) {

        if (this.isFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo plein ! Impossible d'ajouter " + this.name);
            return false;
        }


        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(this.name)) {
                System.out.println("L'animal " + this.name + " existe déjà dans le zoo !");
                return false;
            }
        }


        animals[animalCount] = animal;
        animalCount++;
        return true;
    }




    //instruction 11:
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            System.out.println("Animaux du zoo " + name + " :");
            for (int i = 0; i < animalCount; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(String animalN) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animalN)) {
                return i;
            }
        }
        return -1;

    }

    //instruction 13:
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(this.name)) {
                animals[i] = animals[animalCount - 1];
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }



    //instruction 16:
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            return null;
        }
    }










}
