import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rev="";
        String c=sc.nextLine();
        for(int i=c.length()-1; i>=0; i--)
        {
            rev=rev+c.charAt(i);
        }
        System.out.println(rev);

        if(c.equals(rev))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }
}
