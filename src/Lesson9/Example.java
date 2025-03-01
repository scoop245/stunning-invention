package Lesson9;

import java.util.HashSet;
import java.util.Set;

public class Example {

    private final String first, last;
    private int hash;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;

        hash = 31 * hash + (first != null ? first.hashCode() : 0);
        hash = 31 * hash + (last != null ? last.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (hash != o.hashCode()){return  false;}
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return first.equals(example.first) && last.equals(example.last);
    }

    @Override
    public int hashCode() {
        return hash;
    }

    public static void main(String[] args) {
        Example a = new Example("Donald", "Duck");
        Example b = new Example("Donal", "Duck");
        Example c = new Example("Donal", "Duck");
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
//        System.out.println(s.equals(new Example("Donald", "Duck")));
//        System.out.println(s.equals(new Example("Donal", "Duck")));
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(c));
        System.out.println(s.contains(a));
        System.out.println("");
    }
}
