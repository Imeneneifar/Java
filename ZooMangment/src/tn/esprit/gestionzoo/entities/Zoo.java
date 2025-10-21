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

    public Zoo() {
    }


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
            System.out.println("tn.esprit.gestionzoo.enttiies.Zoo plein ! Impossible d'ajouter " + this.name);
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


    Aquatic[] aquaticAnimals = new Aquatic[NBR_CAGES];
    int aquaticAnimalCount = 0;
    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getAquaticAnimalCount() {
        return aquaticAnimalCount;

    }
    public void setAquaticAnimalCount(int aquaticAnimalCount) {
        this.aquaticAnimalCount = aquaticAnimalCount;
    }

    // Prosit 6: add aquatic animal to the dedicated array
    public boolean addAquaticAnimal(Aquatic a) {
        if (a == null) return false;
        if (aquaticAnimalCount >= aquaticAnimals.length) return false;
        aquaticAnimals[aquaticAnimalCount++] = a;
        return true;
    }

    // Prosit 6: iterate and call swim() on all aquatic animals
    public void makeAllAquaticSwim() {
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] != null) aquaticAnimals[i].swim();
        }
    }

    // Prosit 6: max depth among penguins
    public float maxPenguinDepth() {
        float max = 0f;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > max) max = depth;
            }
        }
        return max;
    }

    // Prosit 6: count dolphins and penguins
    public void printCountsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticAnimalCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println("Dolphins: " + dolphins + ", Penguins: " + penguins);
    }


}
