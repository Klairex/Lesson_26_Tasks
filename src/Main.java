public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Animal("Leu", "Carne"),
                new Animal("Elephant", "Iarba"),
                new Animal("Maimuta", "Banane"),
                new Animal("Panda", "Frunze")
        };

        Zoo zoo = new Zoo(animals);
        zoo.startFeeding();
    }
}
