import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Read the input string from the console
        String input = scanner.nextLine();
        try {
            // Check if the input string matches the expected value
            if (!input.equals("India")) {
                // If the input string does not match the expected value, throw NOMATCHEXCP
                throw new NOMATCHEXCP(input);
            } else {
                // If the input string matches the expected value, print a message
                System.out.println("Input string is valid");
            }
        } catch (NOMATCHEXCP e) {
            // Catch NOMATCHEXCP and print the error message
            System.out.println(e);
        }
    }
}
