public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (NumberFormatException e) {
                // Catching NumberFormatException if user input is not a valid integer
                System.out.println(arg + " is not a valid integer");
            } catch (FactorialException e) {
                // Catching custom exception, FactorialException, if n is out of range (0-15)
                System.out.println("FactorialException: " + e);
            }
        }
    }
    public static int factorial(int n) throws FactorialException {
        // Method to calculate factorial of a number
        if (n < 0 || n > 15) {
            // If n is out of range (0-15), throw FactorialException
            throw new FactorialException(n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}