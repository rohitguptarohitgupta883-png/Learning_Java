import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    int sum=0,n2=n;
    if(n<10)
    System.out.println(" give a two or more digit number");
    else
        {
            while(n>0)
            {
                int d=n%10;
                sum=sum*10 + d;
                n/=10;
            }
            if(sum==n2)
            System.out.println("num is palindrome");
        else
            System.out.println("num is not palindrome");
        }    
        
        sc.close();
}
}
