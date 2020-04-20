package Question2;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
    public void duplicateDisplay(int[] arr) {
        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> s1 = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            boolean response = s.add(arr[i]);
            if (!response)
                s1.add(arr[i]);
        }
        if (!s1.isEmpty()) {
            System.out.println("duplicate elements found:");
            for (int x : s1) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else
            System.out.println("no duplicate element found");

    }
}
