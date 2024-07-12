class Parent
{
    public void show()
    {
        System.out.println("Parent show");
    }
}
class Child extends Parent
{
    public void display()
    {
        System.out.println("Child display");
    }    
}
public class Inheritance {
    public static void main(String[] args) {
        Child c=new Child();    //object of child class can access both fxn of parent and child
        c.show();
        c.display();

        Parent s=new Child();    //object of parent class can only access fxn of parent class  
        s.display();
    }    
}
