package lesson3;

class Cat extends Animal {
    private String s = "Cat";

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("purr purr purr...");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
