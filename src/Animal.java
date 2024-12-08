import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Animal {

    private String name;
    private String hrana;

    public Animal(String name, String hrana) {
        this.name = name;
        this.hrana = hrana;
    }

    // Method to feed the animal with its specified meal
    public void feed() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Format time to only show hours, minutes, and seconds
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime + " - " + name + " a fost alimentat cu " + hrana + ".");
    }
}
