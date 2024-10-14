import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {
        
        List<Integer> v = new LinkedList<>();
    
        v.add(10);
        v.add(20);
        v.add(30);  

        ListIterator<Integer> litr = v.listIterator();

        while (litr.hasNext()) {
            Object elem = litr.next();
            System.out.println(elem);
        }

        System.out.println("After Update");

        
        litr = v.listIterator();

        while (litr.hasNext()) {
            Object elem = litr.next();
            if (elem.equals(20)) {
                litr.remove(); 
            } else { 
                System.out.println(elem);
            }
        }

        System.out.println("previos");

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}