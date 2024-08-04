public class method_overload {
    static void mo()
    {
        System.out.println("Hello Bro!");
    }
    static void mo(int a)
    {
        System.out.println("Hello " +a +" Bro!");
    }
    static void mo(float a)
    {
        System.out.println("Hello "+a+ " Bro!");
    }

    public static void main(String[] args) {
        mo();
        mo(10);
        mo(10.1f);
    }
}
