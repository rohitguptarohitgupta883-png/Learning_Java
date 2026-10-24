package Day_7;
import java.util.*;
public class Search2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int k=sc.nextInt();
        int[][] a=new int[k][k];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
        {
            a[i][j]=sc.nextInt();

        }
        }
        System.out.println("Ente the number to be searched");
        int n=sc.nextInt();
        Search(a,n);
        sc.close();
    }
        static void Search(int[][] arr,int m)
        {
            int b=-1;
            int c=-1;
           for(int i=0;i<arr.length;i++)
           {for(int j=0;j<arr[i].length;j++)
           {
                if(arr[i][j]==m){
                    b=i;
                    c=j;
                }
           }
           }
          if(b>-1)
                    System.out.println("no is at row"+(b+1) +"column "+(c+1));
                else
                    System.out.println("-1,-1");
    }
}

