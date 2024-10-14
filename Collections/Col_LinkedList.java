import java.util.*;

public class Col_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> Name = new LinkedList<String>();
        Name.add("Dharmik");
        Name.add("Krish");
        Name.add("Harshad");
        System.out.println(Name);

        Name.addFirst("Rohit");     // Beginning ma add Karva mate
        System.out.println(Name);

        Name.addLast("Amir");       // End ma add karva mate
        System.out.println(Name);

        Name.add(3, "Harsh");       // Particular index Par add karva mate
        System.out.println(Name);

        Name.removeFirst();      // Beginning index remove karse
        System.out.println(Name);

        Name.removeLast();      // end index remove karse
        System.out.println(Name);

        for(String str:Name)
        {
            System.out.println(str);
        }
    }
}
