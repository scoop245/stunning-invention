package lesson7;

import java.util.Random;

public interface Printable {
    void print(String s);
    default int generateRandomNumber() {
        return new Random().nextInt(3);
    }
}
