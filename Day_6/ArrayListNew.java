package Day_6;
import java.util.ArrayList;
public class ArrayListNew {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(10);
        for(int i=0;i<=10;i++)
            list.add(i);
        System.err.println(list);
        System.out.println(list.contains(5));
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
    
}
