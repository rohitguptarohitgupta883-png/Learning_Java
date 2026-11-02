package Day_11;
import java.util.*;
public class Search_2D {
    static void search(int[][] a)
    {
        Scanner sc=new Scanner(System.in);
        int k=a[0].length;
        System.out.println("Enter ur target");
        int tar=sc.nextInt();
        int l=-1;
        for(int i=0;i<k;i++)
        {
            if(a[i][0]<=tar&&a[i][(k-1)]>=tar)
            {
                System.out.println("Row is "+i);
                binarysearch(i,a,tar);
                l=i;
            }
            
        }if(l==-1)
            {
                System.out.println("element not found");
            }
        sc.close();
        //System.out.println(k+" "+tar);
    } 
    static void binarysearch(int row,int[][] b,int target)
    {
        int start=0;
        int end=b[row].length-1;
        int mid=0;
        int l=-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(target>b[row][mid])
                start=mid+1;
            if(target<b[row][mid])
                end=mid-1;
            if(target==b[row][mid])
                {
                    l=mid;
                    System.out.println("Element found at "+row+" column "+l);
                    break;
                }
            
        }
        if(l==-1)
            {
                System.out.println("element not found");
            }

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length And elemnts");
      int k=sc.nextInt();
      int[][]  a=new int[k][k];
      for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 2D array is");
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        search(a);  
        sc.close();

    }
    
}
