import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type  start to start the calculator");
        String s=sc.next();
        while(s.equals("start"))
        {
            System.out.println("enter the operator u want to perform");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. %");
            char x=sc.next().charAt(0);
            if(x== '+')
            {
                System.out.println("enter how many numbers u want to add");
                double k=sc.nextInt();
                double sum=0;
                System.out.println("enter  numbers one by one");
                for(double i=1;i<=k;i++)
                {
                    double q=sc.nextInt();
                    sum+=q;
                }
                System.out.println("the sum is "+ sum);
                System.out.println("if want to stop the calculator type 0");
                if((sc.nextInt())==0)
                    s="stop";
            }
            if(x== '-')
            {
                System.out.println("enter  numbers one by one");
                double n1=sc.nextInt();
                double n2=sc.nextInt();
                System.out.println("diff is "+ (n1-n2));
                System.out.println("if want to stop the calculator type 0");
                if((sc.nextInt())==0)
                    s="stop";
            }
            if(x== '*')
            {
                System.out.println("enter how many numbers u want to add");
                double k=sc.nextInt();
                double prod=1;
                System.out.println("enter  numbers one by one");
                for(double i=1;i<=k;i++)
                {
                    double q=sc.nextInt();
                    prod*=q;
                }
                System.out.println("the product  is "+ prod);
                System.out.println("if want to stop the calculator type 0");
                if((sc.nextInt())==0)
                    s="stop";
            }
            if(x== '/')
            {
                System.out.println("enter  numbers one by one");
                double n1=sc.nextDouble();
                double n2=sc.nextDouble();
                System.out.println("result is "+ (n1/n2));
                System.out.println("if want to stop the calculator type 0");
                if((sc.nextInt())==0)
                    s="stop";

            }
            if(x== '%')
            {
                System.out.println("enter  numbers one by one");
                double n1=sc.nextDouble();
                double n2=sc.nextDouble();
                System.out.println("result is "+ (n1%n2));
                System.out.println("if want to stop the calculator type 0");
                if((sc.nextInt())==0)
                    s="stop";

            }
        }
        sc.close();
        
    }
}
