package Day_7;
import java.util.*;
public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter the elemnts");
        for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        System.out.println();
        System.out.println();
        for(int i=0;i<l;i++)
            if((count(a[i])%2==0))
                System.out.println(a[i]);
            sc.close();
        
    }
    static int count(int n)
    {
        int k=0;
        while(n>0)
        {
           k++;
           n/=10;
        }
        return k;

    }
}
