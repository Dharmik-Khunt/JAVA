public class Temp {
    int x;

    public Temp() {
        this(5);
        System.out.println("The Default constructor");
    }

    public Temp(int x) {
        this(5,15);
        System.out.println(x);
    }

    public Temp(int x, int y) {
        // this(5);
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        new Temp();
    }
}
