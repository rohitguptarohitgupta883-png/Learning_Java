package Day_5;
import java.util.*;
public class Var_Args {
    public static void main(String[] args) {
        bablu(1, 2, 3, 4, 5, 6, 7, 7, 8, 54 ,43);
    }
    static void bablu(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}
