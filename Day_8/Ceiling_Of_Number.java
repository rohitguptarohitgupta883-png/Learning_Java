package Day_8;
import java.util.*;
public class Ceiling_Of_Number {
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
        if(target<=arr[(arr.length)-1])
        {
        int start=0,end=((arr.length)-1);
        int k=-1;
        int mid=0;
        while(start<=end)
        {
            //System.out.println("Start ="+start+"end= "+end);
             mid=(int)((start+end)/2);
            if(target<(arr[mid]))
                end=mid-1;
            if(target>arr[mid])
                start=mid+1;
            if(target==arr[mid])
            {
                k=mid;
                break;
            }
        }//System.out.println("mid ="+mid);
        if(k!=-1)
            System.out.println("ceiling of num= "+arr[k]);
        else if(k==-1)
            System.out.println("ceiling of num= "+arr[start]);
     }
     else
        System.out.println("please enter a valid target");
    }
    
}
