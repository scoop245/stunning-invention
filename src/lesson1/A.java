package lesson1;
class A implements Cloneable {

    private int a;
    private int b;
    private int c;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
//        if (getClass() != o.getClass())return false;
        if (!(o instanceof A)) return false;
        A myA = (A) o;

        return this.a == myA.a && this.b == myA.b && this.c == myA.c;
    }

    @Override
    public String toString() {
        return "a = " +a + " b = " + b;
    }
}