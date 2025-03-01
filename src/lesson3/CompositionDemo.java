package lesson3;

public class CompositionDemo {
    private String s1, s2, s3;
    private StringHolder sh = new StringHolder();
    private int i;
    private double d;

    @Override
    public String toString() {
        return "s1 = " + s1 +
                " s2 = " + s2 +
                " s3 = " + s3 +
                " sh = " + sh +
                " i = "  + i +
                " d = " + d;
    }
}
