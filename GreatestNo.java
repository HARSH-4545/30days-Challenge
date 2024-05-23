import java.util.Scanner;

public class GreatestNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Determine the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

        // Close the scanner
        scanner.close();
    }
}
