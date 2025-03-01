package lesson3;

import java.util.Random;

public class Employee {
    private static int nextId;
    private int id;
    private String name;
    private double salary;

    // object initialization block
    {
        System.out.println("Inside initialization block");
        id = nextId;
        nextId++;
        System.out.println("nextId = " + nextId);
        System.out.println("id = " + id);
    }

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
        System.out.println(nextId);
    }

    public Employee(String name, double salary) {
        System.out.println("Inside Employee(String, double) constructor");
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Inside empty constructor");
        this.name = "";
        this.salary = 0.0;
    }

    public int getId() {
        return this.id;
    }
}
