package Day_10;
//max num from array(mountain array first inc and then dec) using binary search
import java.util.*;
public class Peak_Index {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the lenhth and elements");
         int l=sc.nextInt();
         int[] a=new int[l];
         for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        int k= search(a);
        System.out.println("max index = "+k);
        sc.close();
    }
    static int search(int[] a)
        {           
            int k=-1;
           int start=0,end=a.length-1,mid=0;
           while (start<=end) {
            mid=(start+end)/2;
            k=mid;
            if(a[mid]<a[mid+1])
                start=mid+1;
            else if(a[mid-1]>a[mid])
                end=mid-1;
            else 
                break;
           }
           return k;

        }
    
}
