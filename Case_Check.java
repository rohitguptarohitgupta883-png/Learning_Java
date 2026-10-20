import java.util.*;
public class Case_Check {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your chars");
    char x=sc.next().charAt(0);
    if(Character.isUpperCase(x)== true)
        System.out.println("uppercase");
    else
        System.out.println("lowercase");
    sc.close();


}    
}
