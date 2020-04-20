package Question1;

import java.util.Scanner;

public class Program1 {
    public void occurrenceOfNumber(int element, int[] a) {
        int count = 0;
        int b[]=new int[a.length];
        int k=0;
        System.out.println("Indexes are:");
        for (int i = 0; i < a.length; i++) {
            if (element == a[i]) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("It has occured "+count+" times");
    }
}
