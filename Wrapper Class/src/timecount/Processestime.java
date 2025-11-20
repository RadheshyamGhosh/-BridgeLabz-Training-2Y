package timecount;

import java.util.ArrayList;

public class Processestime {
    public static void main(String[] args) {

        int SIZE = 1_000_000;

        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++){list.add(i);}
        long sum1 = 0;
        for (Integer n : list){ sum1 += n;}   
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++){ arr[i] = i;}
        long sum2 = 0;
        for (int n : arr){ sum2 += n;}
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (end1 - start1) + " ms");
        System.out.println("int[] time: " + (end2 - start2) + " ms");
    }
}
