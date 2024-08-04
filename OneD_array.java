//Replace odd element by 2*element
import java.util.*;
public class OneD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [10];
        int [] arr2=new int [10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i]%2==1)
            {
                arr2[i] = 2*arr[i];
            }
            else
            {
                arr2[i]=arr[i];
            }
        }
        System.out.println("After Logic:");
        for(int i=0; i<10; i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
