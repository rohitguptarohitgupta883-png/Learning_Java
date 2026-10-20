import java.util.Scanner;
public class PracticeFibo
{
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired limit -" );
        int n=sc.nextInt();
        System.out.print("0 1 " );
        for(int i=2;i<=(n-1);i++)
        {
            int c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
        sc.close();
    }
    
}
