package Day_6;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        a[1]=1;
        a[2]=3;
        a[0]=9;
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        sc.close();
    }
    
}
