public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tigre", 3, true);

        Zoo myZoo = new Zoo("Esprit Zoo", "Tunis", 20);

        myZoo.displayZoo();


        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(myZoo);


    }
}
