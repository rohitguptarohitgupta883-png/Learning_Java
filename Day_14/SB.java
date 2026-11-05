package Day_14;

public class SB {
    public static void main(String[] args) {
    StringBuilder s=new StringBuilder();
     for(int i=0;i<26;i++)
    {
        char ch=(char)('a'+i);
        System.out.print(ch+" ");
        s.append(ch);
    }    
    System.out.println();
    System.out.println(s); 
    
    s=new StringBuilder("mom");
    System.out.println(s.equals(s.reverse()));
    }   
}