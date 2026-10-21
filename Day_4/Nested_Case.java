import java.util.Scanner;
public class Nested_Case
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the following to know about our company");
        System.out.println("1 to know abt employee on C level");
        System.out.println("2 to know abt emplyee on tier B level");
        System.out.println("3 to abt emplyee on tier A level");
        int n=sc.nextInt();
        sc.nextLine();
        String s;
        switch (n)
        {
            case 1:
                System.out.println("Man Alpha");
                break;
            case 2:
                System.out.println("Man Beta");
                break;
            case 3:
                System.out.println("there are 3 depts CSE,IT,ECE.Enter the r5espective department to know in detail");
                s=sc.nextLine();
                switch (s)
                {case "CSE":
                        System.out.println("Man Gamma");
                        break;
                    case "IT":
                        System.out.println("Man Delta");
                        break;
                    case "ECE":
                        System.out.println("Man Sigma");
                        break;
                    default :
                        System.out.println("enter correct dept");}
                break;
            default :
                System.out.println("please enter correct number");
        }
        sc.close();       

    }
}