package Day_10;
//find index of two elements in mountain array having a peak index 
import java.util.*;
public class MountainArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the lenhth and elements");
         int l=sc.nextInt();
         int[] a=new int[l];
         for(int i=0;i<l;i++)
            a[i]=sc.nextInt();
        System.out.println("enter the target");
        int k=sc.nextInt();
        search(a,k);
        sc.close();
    }
    static void search(int[] a,int target)
    {
        System.out.println(Arrays.toString(a));
        int high=-1;
           int start=0,end=a.length-1,mid=0;
           while (start<=end) {
            mid=(start+end)/2;
            high=mid;
            if(a[mid]<a[mid+1])
                start=mid+1;
            else if(a[mid-1]>a[mid])
                end=mid-1;
            else 
                break;
           }
           System.out.println(high);
           start=0;
           end=high-1;
           mid=0;
           int k=-1;
           while(start<=end)
        {
             mid=(int)((start+end)/2);
            if(target<(a[mid]))
                end=mid-1;
            if(target>a[mid])
                start=mid+1;
            if(target==a[mid])
            {
                k=mid;
                break;
            }
        }
        System.out.println("first index= "+k);
        
           start=high+1;
           end=a.length-1;
           mid=0;
            k=-1;

           while(start<=end)
        {
             mid=(int)((start+end)/2);
            if(target<(a[mid]))
                end=mid-1;
            if(target>a[mid])
                start=mid+1;
            if(target==a[mid])
            {
                k=mid;
                break;
            }
        }
        System.out.println("second index= "+k);
    }
}
    

