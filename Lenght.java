import java.util.Scanner;
public class Lenght {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0;
        while(n!=0)
        {
           n=n/10;
           l++;
        }
        System.out.println("Lenght of no is "+l);
        int result=0;
        int on=n; 
        for(int i=1; i<=n; i++)
        {
            int rem=on%10;
            result += Math.pow(rem, l);
            on=on/10;
        }
        if(result==n)
        {
            System.out.println("Num is Armstrong num");
        }
        else
        {
            System.out.println("Num is not  Armstrong num");
        }
    }  
}
