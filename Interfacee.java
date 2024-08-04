/*
1.interface specifies the behavior of a class by providing an abstract type.
2.By default, all the fields in interface will be public,final,static.
3.By default, all the methods in interface will be public and Abstract.
4.It supports multiple inheritance and used to achieve Abstraction & loose coupling.
5. We cannnot create instance or object of abstract class & interface.
*/

interface Animal{
    public void sound();
    public void sleep();
}
class Pig implements Animal
{
    public void sound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
      }
      public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
      }
}
public class Interfacee {
    public static void main(String[] args){
        Pig myPig = new Pig();  // Create a Pig object
        myPig.sound();
        myPig.sleep();
    }
}
