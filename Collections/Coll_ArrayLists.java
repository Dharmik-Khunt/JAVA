import java.util.*;
public class Coll_ArrayLists {
            public static void main(String[] args) {
                ArrayList<String> Name = new ArrayList<String>();

                Name.add("Dharmik");
                Name.add("Krish");
                Name.add("Harshad");
                System.out.println(Name);

                Name.add(1,"Rohit");  // 1 index ma rohit add thay jase
                System.out.println(Name);

                Name.remove(2);     // 2nd index remove karse
                System.out.println(Name);

                Name.set(1, "Kushal");  // 1st index ne rename karva mate
                System.out.println(Name);

                System.out.println(Name.get(2));    // Koi particular index print karva mate

                Name.clear();
                System.out.println(Name);      //Delete all indexes
            }    
}


