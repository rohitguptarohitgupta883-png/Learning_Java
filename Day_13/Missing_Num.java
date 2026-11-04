package Day_13;

import java.util.Arrays;
public class Missing_Num {
     public static void main(String[] args) {
        int a[]={4,0,2,1};
        int l=a.length;
    sort(a,l);
    }
    static void sort(int[] a,int l)
    {
        for(int i=0;i<l;i++)
        {
            if(a[i]!=i&&a[i]!=l)
            {
                swap(a,i,a[i]);
            }
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<l;i++)
        {
            if(a[i]!=i)
            {
                System.out.println("missing num is "+i);
            }
        }
    }
    static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
 
}
