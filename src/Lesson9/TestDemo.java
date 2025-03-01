package Lesson9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class TestDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anton");
        names.add("Anton");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Iryna");
        names.add("Anton");


//        System.out.println(names.stream().filter(r -> r.getFi).collect(Collectors.toList()));
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number:");
        while (true) {
            try {
                int x = Integer.parseInt(bufferedReader.readLine());
                arrayList.add(x);

            } catch (Exception e) {
                for (int x : arrayList) {
                    System.out.println(x);
                }
            }
        }
    }
}
