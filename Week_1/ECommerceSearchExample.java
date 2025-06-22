import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearchExample {
    public static void main(String[] args) {
        // Initialize products
        Product[] productList = {
            new Product(8, "Tablet", "Gadgets"),
            new Product(3, "Camera", "Gadgets"),
            new Product(5, "Speaker", "Gadgets"),
            new Product(1, "Notebook", "Office")
        };
        
        // Sorted array for binary search
        Product[] sortedProducts = Arrays.copyOf(productList, productList.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(Product::getProductId));
        
        // Search tests
        int searchId = 5;
        System.out.println("Search Tests:");
        int linearIdx = linearSearch(productList, searchId);
        System.out.println("Linear Search: ID " + searchId + " at index " + linearIdx);
        
        int binaryIdx = binarySearch(sortedProducts, searchId);
        System.out.println("Binary Search: ID " + searchId + " at index " + binaryIdx);
        
        // Analysis
        System.out.println("\nPerformance Analysis:");
        System.out.println("Big O Notation: Evaluates algorithm efficiency for large inputs.");
        System.out.println("Linear Search:");
        System.out.println("  - Best: O(1) (item at start)");
        System.out.println("  - Average/Worst: O(n) (item in middle/end or absent)");
        System.out.println("Binary Search:");
        System.out.println("  - Best/Average/Worst: O(log n) (sorted data)");
        System.out.println("Time Complexity Comparison: Binary search (O(log n)) is faster than linear search (O(n)) for large datasets.");
        System.out.println("Recommendation: Binary search is ideal for our platform's large, sorted product catalog.");
    }
    
    public static int linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == id) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentId = products[mid].getProductId();
            if (currentId == id) {
                return mid;
            } else if (currentId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

class Product {
    private int productId;
    private String productName;
    private String category;
    
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    
    public int getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public String getCategory() {
        return category;
    }
}