public class FinancialForecastExample {
    public static void main(String[] args) {
        // Test forecast
        double initialAmount = 3000.0;
        double growthRate = 0.03; // 3%
        int years = 15;
        
        System.out.println("Financial Forecast Results:");
        double futureAmount = calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Initial Amount: $%.2f, Growth Rate: %.1f%%, Years: %d%n", 
                         initialAmount, growthRate * 100, years);
        System.out.printf("Future Amount: $%.2f%n", futureAmount);
        
        // Analysis
        System.out.println("\nAlgorithm Analysis:");
        System.out.println("Recursion: Reduces complex problems by solving smaller instances of the same problem.");
        System.out.println("Time Complexity: O(n), where n is years, due to linear recursive calls.");
        System.out.println("Space Complexity: O(n) for recursive stack.");
        System.out.println("Optimization: Iterative loop can reduce space to O(1) by eliminating recursion.");
    }
    
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years <= 0) {
            return amount;
        }
        return calculateFutureValue(amount * (1 + rate), rate, years - 1);
    }
}