package lesson1;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        return (this.age > anotherBoxer.age && this.strength > anotherBoxer.strength &&
                this.weight > anotherBoxer.weight);
    }

    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(36, 85, 50);
        Boxer boxer2 = new Boxer(35, 83, 45);


        System.out.println("This boxer1 fights another boxer: " + boxer1.fight(boxer2));
        System.out.println("Boxer2 fights Boxer1: "+ boxer2.fight(boxer1));

    }
}
