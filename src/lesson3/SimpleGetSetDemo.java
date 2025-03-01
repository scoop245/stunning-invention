package lesson3;

public class SimpleGetSetDemo {
    private int value = 0;
    private boolean active = true;

    public SimpleGetSetDemo() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        value = newValue;
    }

    public boolean isActive() {
        return active;
    }
}
