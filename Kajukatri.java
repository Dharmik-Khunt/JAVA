import java.util.Scanner;

public class Kajukatri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Upper part
        for(int i=1; i<=n; i++)
        {
            
            //for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

           for(int j=1; j<=2*i-1; j++)
           {
                System.out.print("*");
           }
            System.out.println();
        }

        //Lower part
        for(int i=n; i>=1; i--)
        {
            
            //for spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=2*i-1; j++)
            {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
