package Day_9;
import java.util.*;
//question is find first and last index of elemnt in sorted array.
public class Index {
    public static void main(String[] args) {
       int[] b= {5,7,7,7,7,8,8,9,10,10};
       search(b);
    }
    static void search(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target element");
        int target=sc.nextInt();
        sc.close();
        int start=0,end=((arr.length)-1);
        int k=-1;
        int mid=-1;
        int[] index=new int[2];
        index[0]=-1;
        index[1]=-1;
        while(start<=end)
        {
            mid=(int)((start+end)/2);
            if(target<(arr[mid]))
                end=mid-1;
            if(target>arr[mid])
                start=mid+1;
            if(target==arr[mid])
            {
                k=mid;
                index[0]=k;
                end=mid-1;
            }
        }
         start=0;
         end=((arr.length)-1);
        k=-1;
        mid=-1;
        while(start<=end)
        {
            mid=(int)((start+end)/2);
            if(target<(arr[mid]))
                end=mid-1;
            if(target>arr[mid])
                start=mid+1;
            if(target==arr[mid])
            {
                k=mid;
                index[1]=k;
                start=mid+1;
            }
        }
        if(index[0]!=-1&&index[1]!=-1)
          System.out.println("first index= "+index[0]+" last index= "+index[1]);
        else
            System.out.println("element not found");
    } 
    }