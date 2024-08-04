//Some Imp fun in Strings

//Strings are immutable means we cannot change the strings 
public class Strings {
    public static void main(String[] args) {
       
        //concatenation (joining two strings)
        String firstName="DHARMIK";
        String lastName="Khunt";
        String fullName = firstName.concat(lastName);
        System.out.println("1."+fullName);
        
        //lower case
        System.out.println("2."+firstName.toLowerCase());

        //Length of string
        System.out.println("3."+fullName.length());

        //charAt (String na badha character ne ek ek karine print karva mate)
        for(int i=0; i<fullName.length(); i++)
        {
            System.out.println("4."+fullName.charAt(i));
        }

        //.compareTo (comparing two strings)
        if(firstName.compareTo(lastName)==0)
        {
            System.out.println("5.Strings are equal");    //s1>s2 : +ve value
        }                                                 //s1=s2 : 0
        else                                              //s1<s2 : -ve value
        {
            System.out.println("5.Strings are not equal");
        }

        //substring(beg index, end index) [getting small string from a large]
        String sentence="My Name is Dharmik";
        String name = sentence.substring(11,sentence.length());
        System.out.println("6."+name);

        //To remove the spaces in string
        String c="   Hello    ";
        System.out.println("7."+c.trim());

        //To check the string is empty (it return boolean value)
        String d= "";
        System.out.println("8." +d.isEmpty());

        //Either two strings are equal or not
        System.out.println("9." +lastName.equals(firstName));

        //Replace
        System.out.println("10." +firstName.replace('D','M'));

        //
    }
}
