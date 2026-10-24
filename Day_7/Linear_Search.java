package Day_7;
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int k=sc.nextInt();
        int[] a=new int[k];
        for(int i=0;i<k;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Ente the number to be searched");
        int n=sc.nextInt();
        Search(a,n);
        sc.close();
    }
        static void Search(int[] arr,int m)
        {
            int b=-1;
           for(int i=0;i<arr.length;i++)
           {
                if(arr[i]==m)
                    b=i;
           }
          if(b>-1)
                    System.out.println("no is at index "+b);
                else
                    System.out.println(-1);
    }
}
