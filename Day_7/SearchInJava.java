package Day_7;
import java.util.*;
public class SearchInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string and char to search");
        String s=sc.next();
        char x=sc.next().charAt(0);
        boolean q=Search(s,x);
        System.out.println(q);
        sc.close();
    }
    static boolean Search(String a,char z)
    {
        int l=a.length();
        int k=0;
        for(int i=0;i<l;i++)
        {
           if(a.charAt(i)==z)
               k=2;
        }
        if(k==2)
            return true;
        else  
            return false;

              
    }

    
}
