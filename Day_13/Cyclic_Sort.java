package Day_13;

import java.util.Arrays;
import java.util.Scanner;
public class Cyclic_Sort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and array elements");
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
    sort(a,l);
    }
    static void sort(int[] a,int l)
    {
        for(int i=0;i<l;i++)
        {
            
        while(a[i]!=(i+1))
        {
            int k=a[i]-1;
        int temp=a[i];
        a[i]=a[k];
        a[k]=temp;
        }   
        }     
        
        System.out.println(Arrays.toString(a));
    }
    
}
