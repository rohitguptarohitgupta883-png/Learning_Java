package Day_5;

public class Shadowing {
    static int  a =90;
    public static void main(String[] args) {
        System.out.println(a);
        int a=40;
        System.out.println(a);
        bablu();
    }
    static void bablu()
    {
        System.out.println(a);
    }
    
}
