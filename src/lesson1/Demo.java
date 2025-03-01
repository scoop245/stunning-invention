package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Demo {
    public static void main(String[] args) {
//        int[] x = new int[10];
//        for (int i = 0; i < x.length; i++){
//            x[i] =(int) (Math.random() * 50);
//        }
//        for (int i = 0; i < x.length; i++){
//            System.out.print(x[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//        int[] y = x;
//        for (int i = 0; i<x.length; i++) {
//            for(int j = 0; j<x.length; j++) {
//                int a = y[j];
//                int b = y[i];
//                if (b < a) {
//                    y[j] = b;
//                    y[i] = a;
//                }
//            }
//            for (int z = 0; z < y.length; z++) {
//                System.out.print(y[z] + " ");
//            }
//            System.out.println();
//            x = y;
//        }
//        System.out.println();
//        for (int i = 0; i < x.length; i++){
//            System.out.print(x[i] + " ");
//        }

        // Given a list of integers, remove all numbers that occur more than once, and print the remaining elements.
        List<Integer> inputList = Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1); // 4,7,8,1
        List<Integer> newList = new ArrayList<>();
        inputList.forEach(a-> {
            int occures = 0;
                    for (Integer i: inputList) {
                        if (i == a) {
                            occures++;
                        }
                    }
                    if (occures == 1) {
                        newList.add(a);
                    }
        }
        );
        System.out.println("size = " + newList.size());

        newList.stream().forEach(x -> System.out.println("result = " + x));

    }
}
