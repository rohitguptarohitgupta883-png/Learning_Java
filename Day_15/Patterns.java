package Day_15;
public class Patterns {
    public static void main(String[] args) {
        int k=-0;
        for(int i=1;i<=9;i++){
            if(i>=5){
            k=10-i;  
            }
            else
               k=i;
            for(int j=1;j<=k;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }