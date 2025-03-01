package lesson7;

public class A {

    String text;
    int num;

    A(String test) {
        this.text = test;
    }

    A (String test, int number) {
        this(test);
        this.num = number;
    }

}
