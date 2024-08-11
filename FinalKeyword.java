/* The final keyword is a non-access modifier used for classes, attributes and methods, 
which makes them non-changeable 
    1.Stop value change
    2.Stop method Overriding
    3.Stop Inheritance

Note: If you have more than one constructor in your class then it must be initialized in all of them, 
otherwise compile time error will be thrown.

*/

class FinalKeyword {
    final int speedlimit = 90;// final variable

    void run() {
        speedlimit = 400; // As it gives an error bcz we are trying to change the final variable
    }

    public static void main(String args[]) {
        FinalKeyword obj = new FinalKeyword();
        obj.run();
    }
}
