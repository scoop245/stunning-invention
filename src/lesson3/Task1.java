package lesson3;

import java.util.Arrays;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        Robot r = new Robot();
        R2D2 a = new R2D2();
        R3D3 b = new R3D3();
        doSomething(r);
        doSomething(a);
        doSomething(b);
    }


    public static void doSomething(Robot r) {
        System.out.println(r);
    }
}
