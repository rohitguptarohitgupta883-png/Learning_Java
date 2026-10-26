package Day_8;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int k=sc.nextInt();
        sc.nextLine();
        int[] a=new int[k];
        for(int i=0;i<k;i++)
            a[i]=sc.nextInt();
       int[] b=sort(a);
       search(b);
        sc.close();
    }
    static int[] sort(int[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
             for(int j=i+1;j<arr.length;j++)
             {
                  if(arr[i]>arr[j])
                  {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                  }
             }
        }
        System.out.println(Arrays.toString(arr));
         return arr;
     }
    static void search(int[] arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target element");
        int target=sc.nextInt();
        sc.close();
        int start=0,end=((arr.length)-1);
        int k=-1;
        while(start<=end)
        {
            int mid=(int)((start+end)/2);
            if(target<(arr[mid]))
                end=mid-1;
            if(target>arr[mid])
                start=mid+1;
            if(target==arr[mid])
            {
                k=mid;
                break;
            }
        }
        if(k==-1)
          System.out.println("element not found");
        else
            System.out.println("element is at index "+k);
    }
    
}
