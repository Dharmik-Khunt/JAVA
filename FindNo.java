import java.util.Scanner;

public class FindNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the num that to be search:");
        int search=sc.nextInt();

        for(int i=0; i<arr.length; i++)
        {
            if(search == arr[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}
