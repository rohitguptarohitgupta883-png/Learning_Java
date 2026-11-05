package Day_13;

import java.util.Arrays;
public class Missing_Num {
     public static void main(String[] args) {
        int a[]={5,4,2,1,0};
        int l=a.length;
    sort(a,l);
    }
    static void sort(int[] a,int l)
    { 
        for(int i=0;i<l;i++)
        {
            int k=a[i];
                while(a[i]!=a[k])
            {
                if(k!=l&&a[k]!=l)
                    swap(a, i, k);
                else if(a[k]==l)
                {
                    int temp=k;
                    a[i]=l;
                    a[temp]=temp;
                }
                else
                    break;
            }
            
            
        }
        System.out.println(Arrays.toString(a));
    }
    static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
 
}
