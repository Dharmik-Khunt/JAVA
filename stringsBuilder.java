//String Builder etle if apde string ne heap area ma change/edit karvi hoy to stack ma new var no create karvo pade   
public class stringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dharmik");
        System.out.println("1."+sb);
        
        //char at index 0
        System.out.println("2." +sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println("3." +sb); 

        //Insert char at any index and shift remaining indexes accordingly
        sb.insert(2, 'o');
        System.out.println("4."+sb);

        //delete char
        sb.delete(2, 5);
        System.out.println("5."+sb);

        //Append means adding char at last
        sb.append('k');
        sb.append("H");
        sb.append("U");
        System.out.println("6."+sb);
    }
}

