import java.util.*;

class Product {
    int productNo;
    String productName;

    Product(int productNo, String productName) {
        this.productNo = productNo;
        this.productName = productName;
    }

    public String toString() {
        return "Product No: " + productNo + ", Product Name: " + productName;
    }
}

public class javapract25_2nd {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(101, "Laptop"),
            new Product(103, "Mouse"),
            new Product(102, "Keyboard"),
            new Product(101, "Laptop"),
            new Product(102, "Keyboard"),
            new Product(101, "Laptop")
        );

        products.sort(Comparator.comparingInt(p -> p.productNo));

        Map<Integer, Integer> productCount = new HashMap<>();
        for (Product product : products) {
            productCount.put(product.productNo, productCount.getOrDefault(product.productNo, 0) + 1);
        }

        System.out.println("Sorted Products:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nProduct Counts:");
        for (Map.Entry<Integer, Integer> entry : productCount.entrySet()) {
            System.out.println("Product No: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}