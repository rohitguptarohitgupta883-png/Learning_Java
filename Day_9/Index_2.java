package Day_9;

import java.util.*;
//program to fin index of target in infinite array 
public class Index_2 { 
   static void search(double[] arr)
    {
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target element");
        double target=sc.nextDouble();
        sc.close();
        double start=-1,end=-1,mid;
        double index=-1,i=0;
        while(index==-1)
        {
            start=end+1;
            end=Math.pow(10.0,i);
            double start1=start;
            double end1=end;
        while(start1<=end1)
        {
            mid=(double)((int)((start1+end1)/2));
            if(target<(arr[(int)mid]))
                end1=mid-1;
            if(target>arr[(int)mid])
                start1=mid+1;
            if(target==arr[(int)mid])
            {
                index=mid;
            }
        }
        i++;
        if(index!=-1)
            break;
    }
    System.out.println("index of element is "+index);
    } 
}
