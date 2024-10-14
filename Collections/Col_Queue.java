import java.util.*;

public class Col_Queue {
    public static void main(String[] args) {
        ArrayDeque<String> Name = new ArrayDeque<String>();       //FIFO
        
        Name.add("Dharmik");
        Name.add("Krish");
        Name.add("Harshad");
        System.out.println(Name);

        Name.remove();
        System.out.println(Name);
    }
}
