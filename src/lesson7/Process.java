package lesson7;

public class Process implements Printable, Runnable {

    public void run() {
        System.out.println("running()");
    }

    public void print(String s) {
        System.out.println(s);
    }
}
