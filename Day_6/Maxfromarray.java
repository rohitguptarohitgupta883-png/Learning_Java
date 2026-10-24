package Day_6;
import java.util.*;
public class Maxfromarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for (int i=0;i<5;i++)
        a[i]=sc.nextInt();
        int max=0,min=0;
        for (int i=0;i<5;i++){
        if(a[i]>max)
            max=a[i];
        if (a[i]<min)
            min=a[i];
        }
        sc.close();
        System.out.println("Max= "+max +" MIN ="+min);
    }

    
}
