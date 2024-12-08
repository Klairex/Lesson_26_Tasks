public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void startFeeding() {
        for (Animal animal : animals) {
            new Thread(new AnimalFeeder(animal)).start();
        }
    }
}
