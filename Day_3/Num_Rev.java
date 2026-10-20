import java.util.*;
public class Num_Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your num");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum=sum*10 + d;
            n/=10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
