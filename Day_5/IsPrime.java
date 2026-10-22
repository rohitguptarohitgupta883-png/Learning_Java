package Day_5;
import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a=sc.nextInt();
        boolean k=PrimeCheck(a);
        if(k==false)
            System.out.println("not prime");
        else
            System.out.println("prime");
        sc.close();
    }

    static boolean PrimeCheck(int a)
    {
        int c=0;
        if(a==1)
            return false;
        
            for(int i=2;i<=(a-1);i++)
            {
                if(a%i==0)
                    c++;
            }
            if(c==0)
                return true;
            else
                return false;
    }

    
}
