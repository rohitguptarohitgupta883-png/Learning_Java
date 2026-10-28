package Day_8;
//Note that characters wrap around
import java.util.*;
public class Floor_Of_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int k=sc.nextInt();
        sc.nextLine();
        char[] a=new char[k];
        for(int i=0;i<k;i++)
            a[i]=sc.next().charAt(0);
       char[] b=sort(a);
       search(b);
        sc.close();
    }
    static char[] sort(char[] arr)
     {
        for(int i=0;i<arr.length;i++)
        {
             for(int j=i+1;j<arr.length;j++)
             {
                  if(arr[i]>arr[j])
                  {
                     char temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                  }
             }
        }
        System.out.println(Arrays.toString(arr));
         return arr;
     }
    static void search(char[] arr)
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target element");
        int target=sc.next().charAt(0);
        sc.close();
        if(target>=arr[0])
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
            System.out.println("ceiling of char= "+arr[k]);
        else if(k==-1)
            System.out.println("ceiling of char= "+arr[start]);
     }
     else
        System.out.println(arr[(arr.length)-1]);
    }
}
