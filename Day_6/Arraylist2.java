package Day_6;
import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<4;i++)
        {System.out.println("enterlength of arraylist "+(i+1));
        int k=sc.nextInt();
            for(int j=0;j<k;j++)
            {
                list.get(i).add(sc.nextInt());
      
            }
        }
        System.out.println(list);
        sc.close();
    }
    
}
