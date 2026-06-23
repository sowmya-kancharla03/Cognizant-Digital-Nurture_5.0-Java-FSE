import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product's Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product's Category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }
        System.out.print("\nEnter Product ID to search: ");
        int targetId = sc.nextInt();
        System.out.println("\n--- Linear Search ---");
        Product linearResult =
                LinearSearch.search(products, targetId);
        if (linearResult != null) {
            System.out.println("Product Found");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }
        System.out.println("\n--- Binary Search ---");
        Product binaryResult =
                BinarySearch.search(products, targetId);
        if (binaryResult != null) {
            System.out.println("Product Found");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }
        sc.close();
    }

}