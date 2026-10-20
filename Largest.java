import java.util.*;
public class Largest {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 3 nos line by line");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();   
     int max=0,min=0;
     if(a>b && a>c)
     {
        max=a;
        if(b<c)
            min=b;
        else
            min=c;
     }
    if(b>a && b>c)
    {
        max=b;   
        if(a<c)
            min=a;
        else
            min=c;
    }
    if(c>a && c>b)
       { max=c;
        if(b<a)
            min=b;
        else
            min=a;
       }
        if(a==b && b==c)
            System.out.println("3 nos are same");
        else
        System.err.println("max = "+ max + "min = " + min);
        sc.close();
        
    }
    
}
