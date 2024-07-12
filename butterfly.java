import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        //Upper half
        for(int i=1; i<=n; i++)
        {
            //1st part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--)
        {
            //3rd part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }

            //4th part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
