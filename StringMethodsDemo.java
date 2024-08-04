public class StringMethodsDemo {
    public static void main(String[] args) {
        // Demonstrating lastIndexOf()
        String str1 = "Java is fun, Java is cool, Java is powerful!";
        int lastIndex = str1.lastIndexOf("Java");
        System.out.println("Last index of 'Java': " + lastIndex);

        // Demonstrating equalsIgnoreCase()
        String str2 = "Hello, World!";
        String str3 = "hello, world!";
        boolean isEqualIgnoreCase = str2.equalsIgnoreCase(str3);
        System.out.println("Are str2 and str3 equal (ignore case)? " + isEqualIgnoreCase);

        // Demonstrating replaceAll()
        String str4 = "Java is fun and Java is cool.";
        String replacedStr = str4.replaceAll("Java", "Python");
        System.out.println("Replaced: " + replacedStr);

        // Demonstrating isEmpty()
        String str5 = "";
        boolean isEmpty = str5.isEmpty();
        System.out.println("Is str5 empty? " + isEmpty);

        // Demonstrating valueOf()
        int number = 42;
        String numStr = String.valueOf(number);
        System.out.println("String representation of number: " + numStr);

        // Demonstrating join()
        String[] colors = { "Red", "Green", "Blue" };
        String joinedColors = String.join(", ", colors);
        System.out.println("Joined colors: " + joinedColors);

        // Demonstrating getBytes()
        String str6 = "Hello, World!";
        byte[] bytes = str6.getBytes();
        System.out.print("Bytes representation: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}