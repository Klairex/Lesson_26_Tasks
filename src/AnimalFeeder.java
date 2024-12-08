import java.util.Random;

public class AnimalFeeder implements Runnable {
    private Animal animal;
    private Random random;

    public AnimalFeeder(Animal animal) {
        this.animal = animal;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {

            int initialDelay = random.nextInt(10000);
            Thread.sleep(initialDelay);

            while (true) {
                animal.feed();
                Thread.sleep(30000);
            }
        } catch (InterruptedException e) {
            System.out.println("Alimentarea a fost intrerupta: " + e.getMessage());
        }
    }
}
