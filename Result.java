import java.util.*;
interface Exam
{
    default boolean Pass(int marks)
    {
        if(marks>=50)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
interface Classify
{
    default String Division(int avg)
    {
        if(avg>=60)
        {
            return "First";
        }
        else if(avg>=50 && avg<60)
        {
            return "Second";
        }
        else
        {
            return "No division";
        }
    }
}
public class Result implements Exam,Classify{
    public static void main(String[] args) {
        Result sc=new Result();
        Scanner in=new Scanner(System.in);
        int mark=in.nextInt();
        int average=in.nextInt();
        System.out.println(sc.Pass(mark));
        System.out.println(sc.Division(average));
    }
}
