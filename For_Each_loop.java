import java.util.*;
public class For_Each_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //Entering size  of array
        int [] marks = new int[n];
        for(int i=0; i<n; i++)
        {
            marks[i]=sc.nextInt();
        }

        //For_each loop
        System.out.println("Printing using for-each loop");
        for(int element:marks)
        {
            System.out.println(element);
        }
    }
   
}
