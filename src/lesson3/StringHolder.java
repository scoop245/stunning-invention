package lesson3;

public class StringHolder {
    String s;

    StringHolder() {
        System.out.println("Composition Demo");
        s = "New String";
    }

    @Override
    public String toString() {
        return s;
    }
}
