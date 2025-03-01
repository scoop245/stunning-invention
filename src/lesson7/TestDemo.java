package lesson7;

import java.util.Random;

public class TestDemo {
    public static void main(String[] args ){
        int arr[];
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 101) - 50);
            int x;
            int y;
            int z;

            for (x = 1; x < arr.length; x++) {
                for (y = arr.length - 1; y >= x; y--) {
                    if (arr[y - 1] > arr[y]) {
                        z = arr[y - 1];
                        arr[y - 1] = arr[y];
                        arr[y] = z;
                    }
                }
            }


            System.out.print(" " + arr[i]);
        }
    }

    public static int fuctorialN(int n)  {
        if (n==1) {
            return 1;
        }
        return n*fuctorialN(n-1);
    }
}
