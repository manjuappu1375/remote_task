import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read the first number
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read the second number
        
        int sum = num1 + num2; // Calculate the sum
        
        System.out.println("The sum is: " + sum); // Print the result
        
        scanner.close(); // Close the scanner
    }
}
