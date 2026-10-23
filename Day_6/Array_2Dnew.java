package Day_6;
import java.util.*;
public class Array_2Dnew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a= new int [3][4];
        for(int i=0;i<a.length;i++)
        {

            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.err.print(a[i][j]+"  ");
            }
            System.err.println();
        }


        for(int i=0;i<a.length;i++)
        {
            System.err.println(Arrays.toString(a[i]));
        }
        sc.close();
    }

    
}
