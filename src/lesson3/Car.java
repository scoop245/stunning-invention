package lesson3;

public class Car {
    private Car() {

    }

    public static Car makeCar() {
        return new Car();
    }

    public void makeSound() {
        System.out.println("Beep beep");
    }
}
