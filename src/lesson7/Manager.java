package lesson7;

class Manager extends Employee {

    @Override
    void print() {
        System.out.println("I'm a manager");
    }

    void doWork() {
        System.out.println("Doing managers work");
    }
}
