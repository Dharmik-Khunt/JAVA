import java.util.Scanner;

public class Rohmbas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            //for spaces
            int space=n-i;
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            
            //for stars
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
