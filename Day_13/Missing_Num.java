package Day_13;

import java.util.Arrays;

public class Missing_Num {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 2, 1, 0};
        int missing = search(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));
        System.out.println("Missing Number: " + missing);
    }

    static int search(int[] a) {
        int i = 0;
        int l = a.length;

        // Step 1: Cyclic Sort
        while (i < l) {
            int correctIndex = a[i];
            
            // Check if element is within bounds and not already at its correct position
            if (correctIndex < l && a[i] != a[correctIndex]) {
                int temp = a[i];
                a[i] = a[correctIndex];
                a[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Search for the missing number
        for (int index = 0; index < l; index++) {
            if (a[index] != index) {
                return index;
            }
        }

        // If all numbers from 0 to n-1 are present, then n is the missing number
        return l;
    }
}