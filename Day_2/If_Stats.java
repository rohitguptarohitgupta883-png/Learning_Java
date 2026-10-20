import java.util.Scanner;
public class If_Stats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        if(salary> 2500)
            System.out.println("bonus = 2000");
        else
        System.out.println("u poor, no bonus for u");
    sc.close();
    }
    
}
