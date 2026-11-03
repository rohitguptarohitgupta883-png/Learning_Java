package Day_13;
import java.util.*;
public class Insertion_sort {
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
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }

            }
            
        }
        System.out.println(Arrays.toString(a));
        
    }

    
}
