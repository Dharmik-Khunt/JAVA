import java.util.Stack;

public class Col_Stack {
    public static void main(String[] args) {
        Stack<String> Name = new Stack<String>();       //LIFO
        
        Name.push("Dharmik");
        Name.push("Krish");
        Name.push("Harshad");
        System.out.println(Name);

        Name.pop();
        System.out.println(Name);
    }
}
