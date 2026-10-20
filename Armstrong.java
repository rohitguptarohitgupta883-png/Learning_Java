import java.util.Scanner;
public class Armstrong
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        int n2=n,n3=n,n4=n,sum=0;
        int k=0;
        while(n>0)
        {
            k++;
            n/=10;
        }
        while(n3>0)
        {
            int d=n3%10;
            sum+= Math.pow(d,k);
            n3/=10;
        }
        
        if(n4==sum)
            System.out.println("Armstrong number");
        else
            System.out.println(" not Armstrong number");
    
    }
}
