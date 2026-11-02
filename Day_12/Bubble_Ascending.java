package Day_12;
import java.util.Arrays;
import java.util.Scanner;
public class Bubble_Ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and elemnts");
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        sort(a);
        sc.close();
            
}
    static void sort(int[] a)
    {
        int l=a.length;
        int temp=0;
        for(int i=l-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
         
        }
        System.out.println(Arrays.toString(a));
    }
}
