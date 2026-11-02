package Day_12;
import java.util.*;
public class Selection_Ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and elemnts");
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        sc.close();
        sort(a);
            
}
    static void sort(int[] a)
    {
        int l=a.length;
        for(int i=l-1;i>0;i--)
        {
            int max=a[0];
            for(int j=0;j<l;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
            }
            a[i]=max;
         
        }
        System.out.println(Arrays.toString(a));
    }
    
}
