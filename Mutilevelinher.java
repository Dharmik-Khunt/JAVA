class A
{
    public void show()
    {
        System.out.println("A show");
    }
}
class B extends A
{
    
} 
class C extends B
{

}
public class Mutilevelinher {
    public static void main(String[] args) {
        C var = new C();
        var.show();
    }
}
