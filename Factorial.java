// import java.util.Scanner;
// public class Factorial {
//     public static void fact(int n)
//     {  int factorial=1;
//         for(int i=n; i>=1; i--)
//         {
//             factorial=factorial*i;
//         }  
//         System.out.println(factorial);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         fact(n);
//     }
// }

// Using recursion

import java.util.Scanner;
public class Factorial {
    public static int fact(int n)
    {  
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}