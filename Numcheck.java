import java.util.Scanner;
public class Numcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number first And then the digit which is to be checked");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        while(a>0)
        {
            int d=a%10;
            if(d==b)
                c++;
            a/=10;
        }
        System.out.println("times = "+c);
        sc.close();
    }
    
}
