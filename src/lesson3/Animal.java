package lesson3;

public class Animal {
    private String s = "Animal";
    protected String b = "some text";

    public void makeSound() {
        System.out.println("The animal is making a sound...");
    }

    public void sleep() {
        System.out.println("The animal is sleeping...");
    }

    @Override
    public String toString() {
        return s;
    }
}
