//When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level.
//Static blocks are executed before constructors

public class StaticKeyword {
    static int a = 10;
    static int b;
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
